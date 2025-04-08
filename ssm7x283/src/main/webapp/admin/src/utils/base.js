const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm7x283/",
            name: "ssm7x283",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm7x283/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "地纬公司智能办公系统"
        } 
    }
}
export default base
