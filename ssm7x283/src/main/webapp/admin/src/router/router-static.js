import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import baoxiaoshenqing from '@/views/modules/baoxiaoshenqing/list'
    import jingli from '@/views/modules/jingli/list'
    import yuangongdaka from '@/views/modules/yuangongdaka/list'
    import chuchashenqing from '@/views/modules/chuchashenqing/list'
    import ziyuanxinxi from '@/views/modules/ziyuanxinxi/list'
    import gongzuojihua from '@/views/modules/gongzuojihua/list'
    import yuangongqingjia from '@/views/modules/yuangongqingjia/list'
    import jinglidaka from '@/views/modules/jinglidaka/list'
    import bumen from '@/views/modules/bumen/list'
    import renwuxinxi from '@/views/modules/renwuxinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import richengxinxi from '@/views/modules/richengxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/baoxiaoshenqing',
        name: '报销申请',
        component: baoxiaoshenqing
      }
      ,{
	path: '/jingli',
        name: '经理',
        component: jingli
      }
      ,{
	path: '/yuangongdaka',
        name: '员工打卡',
        component: yuangongdaka
      }
      ,{
	path: '/chuchashenqing',
        name: '出差申请',
        component: chuchashenqing
      }
      ,{
	path: '/ziyuanxinxi',
        name: '资源信息',
        component: ziyuanxinxi
      }
      ,{
	path: '/gongzuojihua',
        name: '工作计划',
        component: gongzuojihua
      }
      ,{
	path: '/yuangongqingjia',
        name: '员工请假',
        component: yuangongqingjia
      }
      ,{
	path: '/jinglidaka',
        name: '经理打卡',
        component: jinglidaka
      }
      ,{
	path: '/bumen',
        name: '部门',
        component: bumen
      }
      ,{
	path: '/renwuxinxi',
        name: '任务信息',
        component: renwuxinxi
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/richengxinxi',
        name: '日程信息',
        component: richengxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
