USE [master]
GO
/****** Object:  Database [ShopOnline]    Script Date: 3/27/2019 5:25:55 PM ******/
CREATE DATABASE [ShopOnline]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ShopOnline', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\ShopOnline.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ShopOnline_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\ShopOnline_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [ShopOnline] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ShopOnline].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ShopOnline] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ShopOnline] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ShopOnline] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ShopOnline] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ShopOnline] SET ARITHABORT OFF 
GO
ALTER DATABASE [ShopOnline] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ShopOnline] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ShopOnline] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ShopOnline] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ShopOnline] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ShopOnline] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ShopOnline] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ShopOnline] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ShopOnline] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ShopOnline] SET  ENABLE_BROKER 
GO
ALTER DATABASE [ShopOnline] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ShopOnline] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ShopOnline] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ShopOnline] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ShopOnline] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ShopOnline] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ShopOnline] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ShopOnline] SET RECOVERY FULL 
GO
ALTER DATABASE [ShopOnline] SET  MULTI_USER 
GO
ALTER DATABASE [ShopOnline] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ShopOnline] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ShopOnline] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ShopOnline] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ShopOnline] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'ShopOnline', N'ON'
GO
ALTER DATABASE [ShopOnline] SET QUERY_STORE = OFF
GO
USE [ShopOnline]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 3/27/2019 5:25:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Email] [nvarchar](50) NULL,
	[Password] [nvarchar](80) NULL,
	[Account_Detail_Id] [int] NULL,
	[Role_ID] [int] NULL,
	[Status] [int] NULL,
	[Create_Date] [date] NULL,
	[Active_Code] [nvarchar](50) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account_Detail]    Script Date: 3/27/2019 5:25:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account_Detail](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](100) NOT NULL,
	[Phone_Number] [nvarchar](50) NOT NULL,
	[Gender] [bit] NOT NULL,
	[Address] [nvarchar](500) NOT NULL,
 CONSTRAINT [PK_Account_Detail] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cart]    Script Date: 3/27/2019 5:25:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[ProductID] [int] NULL,
	[Name] [nvarchar](100) NULL,
	[UnitPrice] [float] NULL,
	[Quantity] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 3/27/2019 5:25:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[CategoryID] [smallint] NOT NULL,
	[Name] [nvarchar](15) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[CategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 3/27/2019 5:25:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[ProductID] [smallint] NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[CategoryID] [smallint] NOT NULL,
	[Price] [int] NOT NULL,
	[Description] [nvarchar](50) NOT NULL,
	[Quantity] [int] NOT NULL,
	[StatusID] [smallint] NOT NULL,
	[Image_link] [nvarchar](15) NOT NULL,
	[Note] [nvarchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 3/27/2019 5:25:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_Role] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Status]    Script Date: 3/27/2019 5:25:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Status](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Status] [nvarchar](50) NULL,
 CONSTRAINT [PK_Status] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Status_Product]    Script Date: 3/27/2019 5:25:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Status_Product](
	[StatusID] [smallint] NOT NULL,
	[Name] [nvarchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[StatusID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([Id], [Email], [Password], [Account_Detail_Id], [Role_ID], [Status], [Create_Date], [Active_Code]) VALUES (27, N'thinh@gmail.com', N'$2a$10$O1/5kdH5X52XRdY9KbZ99.Yf.xAv.2.I9zDPYRYXxieWj85Lp65P6', 35, 2, 2, CAST(N'2019-03-27' AS Date), N'LAZ0TI')
SET IDENTITY_INSERT [dbo].[Account] OFF
SET IDENTITY_INSERT [dbo].[Account_Detail] ON 

INSERT [dbo].[Account_Detail] ([Id], [Name], [Phone_Number], [Gender], [Address]) VALUES (14, N'ngô đức minh hiếu', N'0945961998', 1, N'ha noi
69 Chính Kinh Thanh Xuân Hà Nội')
INSERT [dbo].[Account_Detail] ([Id], [Name], [Phone_Number], [Gender], [Address]) VALUES (33, N'ta quang Chung', N'888773593', 1, N'ha noi
69 Chính Kinh Thanh Xuân Hà Nội')
INSERT [dbo].[Account_Detail] ([Id], [Name], [Phone_Number], [Gender], [Address]) VALUES (34, N'Thinh', N'0986142837', 0, N'123a')
INSERT [dbo].[Account_Detail] ([Id], [Name], [Phone_Number], [Gender], [Address]) VALUES (35, N'Thinh Pro', N'0123456789', 1, N'123 A')
SET IDENTITY_INSERT [dbo].[Account_Detail] OFF
INSERT [dbo].[Cart] ([ProductID], [Name], [UnitPrice], [Quantity]) VALUES (1, N'Chuột Fuhlen 9 series G90 Pro Gaming Black', 300000, 30)
INSERT [dbo].[Cart] ([ProductID], [Name], [UnitPrice], [Quantity]) VALUES (2, N'Tai nghe Logitech G933 Gaming Wireless', 400000, 50)
INSERT [dbo].[Cart] ([ProductID], [Name], [UnitPrice], [Quantity]) VALUES (3, N'Chuột Eblue EMS 145REVN-IU USB Red', 300000, 60)
INSERT [dbo].[Categories] ([CategoryID], [Name]) VALUES (1, N'MacBook')
INSERT [dbo].[Categories] ([CategoryID], [Name]) VALUES (2, N'Mac Desktop')
INSERT [dbo].[Categories] ([CategoryID], [Name]) VALUES (3, N'iPhone')
INSERT [dbo].[Categories] ([CategoryID], [Name]) VALUES (4, N'iPad')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (1, N'MacBook Pro 15" 2016', 1, 2799, N'Laptop15inch16', 0, 2, N'mbt1.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (3, N'MacBook Pro 15" 2017', 1, 3299, N'Laptop15inch17', 20, 3, N'mbt2.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (4, N'MacBook Pro 15" 2018', 1, 3899, N'Laptop15inch18', 0, 2, N'mbt3.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (5, N'MacBook Pro 15" 2015', 1, 1899, N'Laptop15inch15', 40, 3, N'mbt4.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (6, N'MacBook Pro 13" 2017', 1, 1399, N'Laptop13inch17', 0, 2, N'mbn4.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (8, N'MacBook Pro 13" 2018', 1, 1799, N'Laptop13inch18', 20, 1, N'mbn1.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (9, N'iMac Pro 2017', 2, 5999, N'Desktoppro17', 70, 1, N'impro.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (11, N'iMac 5K 2017', 2, 3099, N'Desktop17', 90, 1, N'im17.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (12, N'MacBook Pro 13" 2017 non-Touchbar', 1, 1199, N'Laptop13inch172', 0, 2, N'mbn5.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (13, N'Mac Pro 2013', 2, 4599, N'Workstation', 20, 3, N'mp.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (14, N'iPhone XS', 3, 899, N'iPhoneXS', 40, 3, N'iphonexs.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (15, N'iPhone XS Max', 3, 1199, N'iPhoneXSmax', 70, 3, N'iphonexsmax.jpg', N'Yellow')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (17, N'Nokia 1280', 3, 9999, N'Nokia', 80, 3, N'nokia.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (19, N'iPad Pro 12.9" 2018', 4, 2299, N'iPadpro12', 40, 1, N'ipadpro12.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (20, N'iPad Pro 9.7" 2017', 4, 799, N'iPadpro9', 50, 3, N'ipadpro9.jpg', N'Black')
INSERT [dbo].[Products] ([ProductID], [Name], [CategoryID], [Price], [Description], [Quantity], [StatusID], [Image_link], [Note]) VALUES (21, N'Microsoft Surface Pro 2017', 4, 999, N'tablet', 30, 3, N'mssf.jpg', N'Black')
SET IDENTITY_INSERT [dbo].[Role] ON 

INSERT [dbo].[Role] ([Id], [Name]) VALUES (1, N'Admin')
INSERT [dbo].[Role] ([Id], [Name]) VALUES (2, N'Customer')
INSERT [dbo].[Role] ([Id], [Name]) VALUES (3, N'Employee')
SET IDENTITY_INSERT [dbo].[Role] OFF
SET IDENTITY_INSERT [dbo].[Status] ON 

INSERT [dbo].[Status] ([Id], [Status]) VALUES (1, N'Active')
INSERT [dbo].[Status] ([Id], [Status]) VALUES (2, N'Pending')
INSERT [dbo].[Status] ([Id], [Status]) VALUES (3, N'Deactive')
SET IDENTITY_INSERT [dbo].[Status] OFF
INSERT [dbo].[Status_Product] ([StatusID], [Name]) VALUES (1, N'Còn hàng')
INSERT [dbo].[Status_Product] ([StatusID], [Name]) VALUES (2, N'Hết hàng')
INSERT [dbo].[Status_Product] ([StatusID], [Name]) VALUES (3, N'Giảm giá')
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [DF_Account_Creat_Date]  DEFAULT (getdate()) FOR [Create_Date]
GO
USE [master]
GO
ALTER DATABASE [ShopOnline] SET  READ_WRITE 
GO
