  public void Delete(){
        try {
            
            //获取连接
            conn = DBHerpel.getConnection();
            if(conn==null)
            return;
            
            System.out.print("请输入删除的数据:");
            Scanner input = new Scanner(System.in);
            int user = input.nextInt();
            
            //定义sql语句
            String deleteSql = "DELETE FROM login WHERE num="+num+";";
            //获取Statement对象
            stt = conn.createStatement();
            //执行sql语句
            stt.executeUpdate(deleteSql);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            try {
                conn.close();
                
            } catch (Exception e2) {}
            
        }
    }