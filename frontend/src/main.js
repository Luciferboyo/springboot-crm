//从vue框架中导入createApp函数
import { createApp } from 'vue'

//导入css样式，不需要from字句
//import './style.css'

//从element-plus框架导入ElementPlus的组件
import ElementPlus from 'element-plus'

//导入element-plus的css的样式
import 'element-plus/dist/index.css'

//从./App.vue页面导入App组件
//import App from './App.vue'

import LoginView from './views/LoginView.vue'

//利用上面所导入的createApp（）函数，创建一个vue应用，mount是挂载到#app中
createApp(LoginView).use(ElementPlus).mount('#app')
