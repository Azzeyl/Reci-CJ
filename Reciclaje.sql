USE [master]
GO
/****** Object:  Database [reciclaje]    Script Date: 7/06/2024 1:39:15 p. m. ******/
CREATE DATABASE [reciclaje]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'reciclaje25Octubre2023_Data', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\reciclaje25Octubre2023.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'reciclaje25Octubre2023_Log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\reciclaje25Octubre2023.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [reciclaje] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [reciclaje].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [reciclaje] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [reciclaje] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [reciclaje] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [reciclaje] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [reciclaje] SET ARITHABORT OFF 
GO
ALTER DATABASE [reciclaje] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [reciclaje] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [reciclaje] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [reciclaje] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [reciclaje] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [reciclaje] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [reciclaje] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [reciclaje] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [reciclaje] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [reciclaje] SET  ENABLE_BROKER 
GO
ALTER DATABASE [reciclaje] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [reciclaje] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [reciclaje] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [reciclaje] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [reciclaje] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [reciclaje] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [reciclaje] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [reciclaje] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [reciclaje] SET  MULTI_USER 
GO
ALTER DATABASE [reciclaje] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [reciclaje] SET DB_CHAINING OFF 
GO
ALTER DATABASE [reciclaje] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [reciclaje] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [reciclaje] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [reciclaje] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [reciclaje] SET QUERY_STORE = ON
GO
ALTER DATABASE [reciclaje] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [reciclaje]
GO
/****** Object:  Table [dbo].[almacen]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[almacen](
	[id_almacen] [int] IDENTITY(1,1) NOT NULL,
	[Tipo_Material] [varchar](20) NULL,
	[Nombre_Material] [varchar](25) NULL,
	[Cantidad_Material] [int] NULL,
	[Peso] [float] NULL,
	[Valor_kg] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_almacen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[devoluciones]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[devoluciones](
	[id_devolucion] [int] IDENTITY(1,1) NOT NULL,
	[nombre_Empresa] [varchar](50) NULL,
	[estado] [varchar](50) NULL,
 CONSTRAINT [PK_devoluciones] PRIMARY KEY CLUSTERED 
(
	[id_devolucion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[empresa]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[empresa](
	[id_empresa] [int] IDENTITY(1,1) NOT NULL,
	[Nombre_Empresa] [varchar](30) NULL,
	[Direccion] [varchar](20) NULL,
	[Telefono] [varchar](50) NULL,
	[Correo] [varchar](40) NULL,
	[Cantidad_Material] [int] NULL,
	[Nombre_Material] [varchar](50) NULL,
	[Descuento] [int] NULL,
	[Pagos] [varchar](50) NULL,
 CONSTRAINT [PK__empresa__4A0B7E2C923793A1] PRIMARY KEY CLUSTERED 
(
	[id_empresa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[facturacion]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[facturacion](
	[id_facturacion] [int] IDENTITY(1,1) NOT NULL,
	[id_precio_venta] [int] NULL,
	[id_empresa] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_facturacion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[material_Reciclable]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[material_Reciclable](
	[id_material_reciclable] [int] IDENTITY(1,1) NOT NULL,
	[id_almacen] [int] NULL,
	[id_precio_venta] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_material_reciclable] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[precio_Venta]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[precio_Venta](
	[id_precio_venta] [int] IDENTITY(1,1) NOT NULL,
	[Fecha_Venta] [date] NULL,
	[Hora_Venta] [time](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_precio_venta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[registro_Compra]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[registro_Compra](
	[id_Compra] [int] IDENTITY(1,1) NOT NULL,
	[id_usuario] [int] NULL,
	[id_almacen] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_Compra] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[usuario]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[usuario](
	[id_usuario] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](10) NULL,
	[Apellidos] [varchar](20) NULL,
	[Telefono] [varchar](50) NULL,
	[Direccion] [varchar](30) NULL,
	[Nombre_Material] [varchar](50) NULL,
	[Cantidad_Material] [int] NULL,
 CONSTRAINT [PK__usuario__4E3E04ADE2A38DE3] PRIMARY KEY CLUSTERED 
(
	[id_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ventas]    Script Date: 7/06/2024 1:39:16 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ventas](
	[id_venta] [int] NOT NULL,
	[id_empresa] [int] NULL,
	[id_almacen] [int] NULL,
 CONSTRAINT [PK_ventas] PRIMARY KEY CLUSTERED 
(
	[id_venta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[almacen] ON 

INSERT [dbo].[almacen] ([id_almacen], [Tipo_Material], [Nombre_Material], [Cantidad_Material], [Peso], [Valor_kg]) VALUES (1, N'Plastico', N'Botellas', 643, 4, 0.4700)
INSERT [dbo].[almacen] ([id_almacen], [Tipo_Material], [Nombre_Material], [Cantidad_Material], [Peso], [Valor_kg]) VALUES (2, N'Carton', N'Carton', 114, 71, 20000.0000)
INSERT [dbo].[almacen] ([id_almacen], [Tipo_Material], [Nombre_Material], [Cantidad_Material], [Peso], [Valor_kg]) VALUES (3, N'Cobre', N'Alambre', 1, 0.5, 34.7020)
INSERT [dbo].[almacen] ([id_almacen], [Tipo_Material], [Nombre_Material], [Cantidad_Material], [Peso], [Valor_kg]) VALUES (4, N'Aluminio', N'Latas', 467, 10.5, 5.2000)
INSERT [dbo].[almacen] ([id_almacen], [Tipo_Material], [Nombre_Material], [Cantidad_Material], [Peso], [Valor_kg]) VALUES (5, N'Papel', N'Hojas blancas', 15, -4.5, 1.5000)
INSERT [dbo].[almacen] ([id_almacen], [Tipo_Material], [Nombre_Material], [Cantidad_Material], [Peso], [Valor_kg]) VALUES (7, N'Tela', N'Ropa', 50, 90, 22000.0000)
INSERT [dbo].[almacen] ([id_almacen], [Tipo_Material], [Nombre_Material], [Cantidad_Material], [Peso], [Valor_kg]) VALUES (9, NULL, N'Vidrio', 248, NULL, NULL)
SET IDENTITY_INSERT [dbo].[almacen] OFF
GO
SET IDENTITY_INSERT [dbo].[devoluciones] ON 

INSERT [dbo].[devoluciones] ([id_devolucion], [nombre_Empresa], [estado]) VALUES (1, N'ReciclaBogota', N'Aprobado')
INSERT [dbo].[devoluciones] ([id_devolucion], [nombre_Empresa], [estado]) VALUES (2, N'Si Al Reciclaje', N'No aprobado')
INSERT [dbo].[devoluciones] ([id_devolucion], [nombre_Empresa], [estado]) VALUES (3, N'Reutilis', N'Aprobado')
INSERT [dbo].[devoluciones] ([id_devolucion], [nombre_Empresa], [estado]) VALUES (4, N'Clis S.A', N'No aprobado')
SET IDENTITY_INSERT [dbo].[devoluciones] OFF
GO
SET IDENTITY_INSERT [dbo].[empresa] ON 

INSERT [dbo].[empresa] ([id_empresa], [Nombre_Empresa], [Direccion], [Telefono], [Correo], [Cantidad_Material], [Nombre_Material], [Descuento], [Pagos]) VALUES (1, N'Clis S.A', N'Cll 128 # 2-8', N'3125489012  ', N'Clis@gmail.com', 301, N'Papel', 0, N'exito')
INSERT [dbo].[empresa] ([id_empresa], [Nombre_Empresa], [Direccion], [Telefono], [Correo], [Cantidad_Material], [Nombre_Material], [Descuento], [Pagos]) VALUES (4, N'Si Al Reciclaje', N'Cll 32 # 12-6', N'3205486974  ', N'sireciclaje@gmail.com', 467, N'Aluminio', 15, N'exito')
INSERT [dbo].[empresa] ([id_empresa], [Nombre_Empresa], [Direccion], [Telefono], [Correo], [Cantidad_Material], [Nombre_Material], [Descuento], [Pagos]) VALUES (5, N'Limes', N'Cll 20 # 20 -7', N'3154569874  ', N'limes@gmail.com', 214, N'Papel', 0, N'pendiente')
SET IDENTITY_INSERT [dbo].[empresa] OFF
GO
SET IDENTITY_INSERT [dbo].[facturacion] ON 

INSERT [dbo].[facturacion] ([id_facturacion], [id_precio_venta], [id_empresa]) VALUES (1, 4, 5)
INSERT [dbo].[facturacion] ([id_facturacion], [id_precio_venta], [id_empresa]) VALUES (2, 1, 3)
INSERT [dbo].[facturacion] ([id_facturacion], [id_precio_venta], [id_empresa]) VALUES (3, 2, 1)
INSERT [dbo].[facturacion] ([id_facturacion], [id_precio_venta], [id_empresa]) VALUES (4, 5, 2)
INSERT [dbo].[facturacion] ([id_facturacion], [id_precio_venta], [id_empresa]) VALUES (5, 3, 4)
SET IDENTITY_INSERT [dbo].[facturacion] OFF
GO
SET IDENTITY_INSERT [dbo].[material_Reciclable] ON 

INSERT [dbo].[material_Reciclable] ([id_material_reciclable], [id_almacen], [id_precio_venta]) VALUES (1, 3, 5)
INSERT [dbo].[material_Reciclable] ([id_material_reciclable], [id_almacen], [id_precio_venta]) VALUES (2, 1, 2)
INSERT [dbo].[material_Reciclable] ([id_material_reciclable], [id_almacen], [id_precio_venta]) VALUES (3, 4, 1)
INSERT [dbo].[material_Reciclable] ([id_material_reciclable], [id_almacen], [id_precio_venta]) VALUES (4, 2, 3)
INSERT [dbo].[material_Reciclable] ([id_material_reciclable], [id_almacen], [id_precio_venta]) VALUES (5, 5, 4)
SET IDENTITY_INSERT [dbo].[material_Reciclable] OFF
GO
SET IDENTITY_INSERT [dbo].[precio_Venta] ON 

INSERT [dbo].[precio_Venta] ([id_precio_venta], [Fecha_Venta], [Hora_Venta]) VALUES (1, CAST(N'2023-06-01' AS Date), CAST(N'13:04:00' AS Time))
INSERT [dbo].[precio_Venta] ([id_precio_venta], [Fecha_Venta], [Hora_Venta]) VALUES (2, CAST(N'2023-08-20' AS Date), CAST(N'18:00:00' AS Time))
INSERT [dbo].[precio_Venta] ([id_precio_venta], [Fecha_Venta], [Hora_Venta]) VALUES (3, CAST(N'2023-02-10' AS Date), CAST(N'09:00:34' AS Time))
INSERT [dbo].[precio_Venta] ([id_precio_venta], [Fecha_Venta], [Hora_Venta]) VALUES (4, CAST(N'2023-05-01' AS Date), CAST(N'20:20:00' AS Time))
INSERT [dbo].[precio_Venta] ([id_precio_venta], [Fecha_Venta], [Hora_Venta]) VALUES (5, CAST(N'2023-10-11' AS Date), CAST(N'08:04:03' AS Time))
SET IDENTITY_INSERT [dbo].[precio_Venta] OFF
GO
SET IDENTITY_INSERT [dbo].[registro_Compra] ON 

INSERT [dbo].[registro_Compra] ([id_Compra], [id_usuario], [id_almacen]) VALUES (1, 2, 5)
INSERT [dbo].[registro_Compra] ([id_Compra], [id_usuario], [id_almacen]) VALUES (2, 5, 1)
INSERT [dbo].[registro_Compra] ([id_Compra], [id_usuario], [id_almacen]) VALUES (3, 4, 3)
INSERT [dbo].[registro_Compra] ([id_Compra], [id_usuario], [id_almacen]) VALUES (4, 1, 2)
INSERT [dbo].[registro_Compra] ([id_Compra], [id_usuario], [id_almacen]) VALUES (5, 3, 4)
SET IDENTITY_INSERT [dbo].[registro_Compra] OFF
GO
SET IDENTITY_INSERT [dbo].[usuario] ON 

INSERT [dbo].[usuario] ([id_usuario], [Nombre], [Apellidos], [Telefono], [Direccion], [Nombre_Material], [Cantidad_Material]) VALUES (1, N'Wilson', N'Gonzales Carvajal', N'3115874869  ', N'Cll 22 # 22-1', N'Botellas', 124)
INSERT [dbo].[usuario] ([id_usuario], [Nombre], [Apellidos], [Telefono], [Direccion], [Nombre_Material], [Cantidad_Material]) VALUES (2, N'Carlos', N'Mahecha Gomez', N'3165852808  ', N'Cll 52 # 3-2', N'Vidrio', 124)
INSERT [dbo].[usuario] ([id_usuario], [Nombre], [Apellidos], [Telefono], [Direccion], [Nombre_Material], [Cantidad_Material]) VALUES (3, N'Samanta', N'Perez Paez', N'3204587621  ', N'Cll 45 # 4-6', N'Cajas', 78)
INSERT [dbo].[usuario] ([id_usuario], [Nombre], [Apellidos], [Telefono], [Direccion], [Nombre_Material], [Cantidad_Material]) VALUES (4, N'Jonatan', N'Igua Contreras', N'3165475878  ', N'Cll 25 # 9-6', N'Vidrio', 124)
INSERT [dbo].[usuario] ([id_usuario], [Nombre], [Apellidos], [Telefono], [Direccion], [Nombre_Material], [Cantidad_Material]) VALUES (5, N'Luisa', N'Barbosa Jimenez', N'3159875201  ', N'Cll 30 # 4-5', N'Papel', 85)
INSERT [dbo].[usuario] ([id_usuario], [Nombre], [Apellidos], [Telefono], [Direccion], [Nombre_Material], [Cantidad_Material]) VALUES (6, N'Luis', N'Sanchez', N'124578', N'calle 1245', N'Botellas', 1)
SET IDENTITY_INSERT [dbo].[usuario] OFF
GO
INSERT [dbo].[ventas] ([id_venta], [id_empresa], [id_almacen]) VALUES (1, 4, 2)
INSERT [dbo].[ventas] ([id_venta], [id_empresa], [id_almacen]) VALUES (2, 5, 3)
INSERT [dbo].[ventas] ([id_venta], [id_empresa], [id_almacen]) VALUES (3, 3, 1)
INSERT [dbo].[ventas] ([id_venta], [id_empresa], [id_almacen]) VALUES (4, 2, 5)
INSERT [dbo].[ventas] ([id_venta], [id_empresa], [id_almacen]) VALUES (5, 1, 4)
GO
ALTER TABLE [dbo].[material_Reciclable]  WITH CHECK ADD  CONSTRAINT [fk_almacen_dos] FOREIGN KEY([id_almacen])
REFERENCES [dbo].[almacen] ([id_almacen])
GO
ALTER TABLE [dbo].[material_Reciclable] CHECK CONSTRAINT [fk_almacen_dos]
GO
ALTER TABLE [dbo].[material_Reciclable]  WITH CHECK ADD  CONSTRAINT [fk_precio_venta] FOREIGN KEY([id_precio_venta])
REFERENCES [dbo].[precio_Venta] ([id_precio_venta])
GO
ALTER TABLE [dbo].[material_Reciclable] CHECK CONSTRAINT [fk_precio_venta]
GO
ALTER TABLE [dbo].[registro_Compra]  WITH CHECK ADD  CONSTRAINT [fk_almacen] FOREIGN KEY([id_almacen])
REFERENCES [dbo].[almacen] ([id_almacen])
GO
ALTER TABLE [dbo].[registro_Compra] CHECK CONSTRAINT [fk_almacen]
GO
ALTER TABLE [dbo].[registro_Compra]  WITH CHECK ADD  CONSTRAINT [fk_ususario] FOREIGN KEY([id_usuario])
REFERENCES [dbo].[usuario] ([id_usuario])
GO
ALTER TABLE [dbo].[registro_Compra] CHECK CONSTRAINT [fk_ususario]
GO
/****** Object:  StoredProcedure [dbo].[Borrar_Material]    Script Date: 7/06/2024 1:39:17 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[Borrar_Material] (@id_almacen int)
as
	if EXISTS(select * from almacen where (Cantidad_Material = 0 or Cantidad_Material = Null) and (id_almacen = @id_almacen))
		Begin
		print 'Este tipo de material al no tener una cantidad en inventario del almacen sera eliminado'
	
		DELETE from almacen where id_almacen = @id_almacen
		end
	else
		Begin
		print 'El material seleccionado tiene un valor registrado en el inventario, No puede ser eliminado hasta que el stock sea nulo'
		end
GO
/****** Object:  StoredProcedure [dbo].[Descuento_Compra]    Script Date: 7/06/2024 1:39:17 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[Descuento_Compra] (@id_empresa int)
as
	if EXISTS(select * from empresa where Cantidad_Material >= 300 and  id_empresa = @id_empresa)
		Begin
		print 'Esta empresa cuenta con una compra de materiales mayor o igual a 300, por lo tanto en la proxima compra de cualquier
		material que realize se le dara un descuento de 15%, de igual manera se registrara en la minuta de la empresa beneficiada la 
		aplicacion de un unico descuento'

		UPDATE empresa SET Descuento = 15 where id_empresa = @id_empresa
		end
	else
		Begin
		print 'Esta empresa no tiene registrada una compra mayor o igual a 300, pór lo tanto no aplica al descuento'
		UPDATE empresa SET Descuento = 0 where id_empresa = @id_empresa
		end
GO
/****** Object:  StoredProcedure [dbo].[Mostrar_Datos_Almacenamiento]    Script Date: 7/06/2024 1:39:17 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- por medio de id almacen
Create procedure [dbo].[Mostrar_Datos_Almacenamiento] (@id_almacen int)
as
-- Se crea una condicion con el if de que si existe un material con el nombre consultado en la tabla de almacenamiento entonces que me realice la siguiente instruccion
	if EXISTS(select * from almacen where id_almacen= @id_almacen)
		-- Indicamos que aqui empieza la instruccion del if si es verdadera
		Begin
		--Se crea un select para llamar todos los campos de la tabla almacen evaluado por medio de su id
			select * from almacen where id_almacen= @id_almacen
		--Indicamos que aqui terminara la instruccion del if si la condicion es verdadera
		end
	else
		-- Indicamos que aqui empieza la instruccion del if si es falsa
		begin
		-- Le mandamos un mensaje por consola que el material consultado no existe
		print 'El id_consultado no existe en la tabla de almacen'
		--Indicamos que aqui terminara la instruccion del if si la condicion es falsa
		end
GO
/****** Object:  StoredProcedure [dbo].[Mostrar_Datos_Empresa]    Script Date: 7/06/2024 1:39:17 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[Mostrar_Datos_Empresa] (@id_empresa int)
as
	if EXISTS(select * from empresa where id_empresa = @id_empresa)
		-- Indicamos que aqui empieza la instruccion del if si es verdadera
		Begin
		/*Se crea un select para llamar todos los campos de la tabla empresa evaluado por medio de su id*/
		select * from empresa where id_empresa = @id_empresa
		--Indicamos que aqui terminara la instruccion del if si la condicion es verdadera
		end
	else
		-- Indicamos que aqui empieza la instruccion del if si es falsa
		begin
		-- Le mandamos un mensaje por consola que el material consultado no existe
		print 'El id_consultado no existe en la tabla de empresa'
		--Indicamos que aqui terminara la instruccion del if si la condicion es falsa
		end
GO
/****** Object:  StoredProcedure [dbo].[Mostrar_empresa]    Script Date: 7/06/2024 1:39:17 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

Create procedure [dbo].[Mostrar_empresa] (@id_empresa int)
as
	select * from empresa where id_empresa = @id_empresa
GO
/****** Object:  StoredProcedure [dbo].[Mostrar_material]    Script Date: 7/06/2024 1:39:17 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[Mostrar_material] (@id_almacen int)
as
	select * from almacen where id_almacen= @id_almacen

GO
/****** Object:  StoredProcedure [dbo].[Nuevo_Material]    Script Date: 7/06/2024 1:39:17 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[Nuevo_Material] (@tipo_Material varchar (20),@nombre_Material varchar(25),@cantidad_Material int, @peso float, @valor_kg money)
as
	-- Se crea una condicion con el if de que si existe un material con el nombre consultado en la tabla de almacenamiento entonces que me realice la siguiente instruccion
	if EXISTS(select * from almacen where Nombre_Material = @nombre_Material)
		-- Indicamos que aqui empieza la instruccion del if si es verdadera
		Begin
		--Le mandamos un mensaje por consola indicando que el material ya exite, con actualizara los campos del material consultado.
		print 'Este tipo de material ya existe en el inventario del almacen, por lo tanto
		Se hara una actualizacion al material existente'
		--Actualizamos los campos cantidad material, peso, y valor_kg de la tabla almacen
		UPDATE almacen set Cantidad_Material = @cantidad_Material, Peso = @peso, Valor_kg = @valor_kg
		--indicamos que la actualizacion se hara en el registro que tenga el tipo_Material y Nombre_Material igual al consultado
		where Tipo_Material = @tipo_Material and Nombre_Material = @nombre_Material
		--Indicamos que aqui terminara la instruccion del if si la condicion es verdadera
		end
	else
		-- Indicamos que aqui empieza la instruccion del if si es falsa
		Begin
		-- Le mandamos un mensaje por pantalla indicando que el material no exite, con lo cual se añadira un nuevo registro con los datos insertados.
		print 'Este tipo de material No existe en el inventario del almacen, por lo tanto
		Se adicionara a la tabla de almacen'
		-- Indicamos que añadimos a la tabla almacen los valores de tipo_Material, Nombre_Material, Cantidad_Material, Peso y valor_kg digitados
		INSERT into almacen values (@tipo_Material,@nombre_Material,@cantidad_Material,@peso,@valor_kg)
		--Indicamos que aqui terminara la instruccion del if si la condicion es falsa
		end
GO
/****** Object:  StoredProcedure [dbo].[Nuevo_Materiales]    Script Date: 7/06/2024 1:39:17 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[Nuevo_Materiales] (@tipo_Material varchar (20),@nombre_Material varchar(25),@cantidad_Material int, @peso float, @valor_kg money)
as
	if EXISTS(select * from almacen where Nombre_Material = @nombre_Material)
		Begin
		print 'Este tipo de material ya existe en el inventario del almacen, por lo tanto
		Se hara una actualización al material existente'

		UPDATE almacen set Cantidad_Material = @cantidad_Material, Peso = @peso, Valor_kg = @valor_kg
		where Tipo_Material = @tipo_Material and Nombre_Material = @nombre_Material
		end
	else
		Begin
		print 'Este tipo de material No existe en el inventario del almacen, por lo tanto
		Se adicionara a la tabla de almacen'

		INSERT into almacen values (@tipo_Material,@nombre_Material,@cantidad_Material,@peso,@valor_kg)
		end
GO
USE [master]
GO
ALTER DATABASE [reciclaje] SET  READ_WRITE 
GO
