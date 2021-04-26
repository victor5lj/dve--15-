//使用PreparedStatement接口中的executeUpdate()方法实现修改数据
    public void Update(){
        
        try {
            //获取连接
            conn = DBHerpel.getConnection();
            if(conn==null)
                return;
            
            System.out.print("请输入书号:");
            Scanner input = new Scanner(System.in);
            int user = input.nextInt();
            System.out.print("请输入新书号:");
            String NewPwd = input.next();
            //定义Sql语句
            String UpdateSql = "UPDATE login SET pwd = '"+NewPwd+"' WHERE user = "+user+";";
            PreparedStatement ps = conn.prepareStatement(UpdateSql);
            //执行sql语句
            ps.executeUpdate();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }finally{
            //释放资源
            try {
                conn.close();
            } catch (Exception e2) {}
            
        }
    }