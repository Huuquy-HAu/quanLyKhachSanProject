create database quan_ly_khack_san

use quan_ly_khack_san

create table khack_hang(
id int identity,
UserName nvarchar(50),
GioiTinh nvarchar(10),
phone nvarchar(15),
loai_phong nvarchar(20),
gia_phong nvarchar(20),
tinh_trang nvarchar(20),
primary key(id)
)

insert into khack_hang(UserName,GioiTinh,phone,loai_phong,gia_phong,tinh_trang)
values (N'Nguyễn Văn A',N'Nam', '0906609906', N'Thường', N'2000000', N'Đã trả phòng'),
(N'Dương Văn B',N'Nam', '0906609906', N'Thương gia', N'5000000', N'Chưa nhận phòng'),
(N'Nguyễn Thị C',N'Nữ', '0906609906', N'VIP', N'7000000', N'Đang thuê'),
(N'Nguyễn Văn A',N'Nam', '0906609906', N'Thường', N'2000000', N'Đã trả phòng')


select * from khack_hang

drop table khack_hang