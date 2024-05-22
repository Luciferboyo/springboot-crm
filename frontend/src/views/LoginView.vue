
<template>
    <el-container>
      <!-- left -->
      <el-aside width="200px">
        <img src="../assets/loginBox.svg">
        <p class="imgTitle">
          Welcome to the "My World" customer relationship management system
          </p>
      </el-aside>
      <!-- rigth -->
      <el-main>
        <h1 class="loginTitle">Welcome Login</h1>
        <el-form ref="loginRefForm" :model="user" label-width="120px" :rules="loginRules">
          <el-form-item label="Username" prop="loginAct">
            <el-input v-model="user.loginAct" />
          </el-form-item>

          <el-form-item label="Password" prop="loginPwd">
            <el-input type="password" v-model="user.loginPwd" />
          </el-form-item>

          <el-form-item>
            <el-button type="primary" @click="login">login</el-button>
            <el-button type="primary">register</el-button>
          </el-form-item>
          
          <el-form-item>
            <el-checkbox label="Remember password" name="rememberMe">
            </el-checkbox>
          </el-form-item>
        </el-form>
      </el-main>
    </el-container>

</template>

<script>
import { defineComponent } from 'vue'

export default defineComponent({
  //component name
  name: "LoginView",

  //Define variables used by the page, when defining,the initial values are all given to null values.
  data(){
    return{
      //Object variable definition is{}
      user : {},
      //String variable definition is ''
      //name : '',
      //number variable definition is 0
      //age : 0,
      //array variable definition is []
      //arr : []
      //list collection variable definition is [{}]
      //userList : [{}]
      //Define validation rules for login forms
      loginRules : {
        //
        loginAct : [
          { required: true, message: 'Please input username', trigger: 'blur' },
        ],
        loginPwd : [
          { required: true, message: 'Please input password', trigger: 'blur' },
          { min: 6, max: 16, message: 'The password length should be 6 to 16', trigger: 'blur' },
        ]
      },
    }
  },

  //The js functions that need to be used on the page are all defined in the "methods" attribute
  methods: {
    //login function
    login(){
      //Verify the legality of the input box before submitting
      this.$$refs.loginRefForm.validate( (isValid) => {
        //"isValid" is the result after verification.If it is true,it means the verification is passed,
        //otherwise it is not passed
        if(isValid){
          //Verification passed, you can submit to log in
          
        }
      })
    }
  }
})
</script>

<style scoped>
.el-aside{
  background: black;
  width: 40%;
  text-align: center;
}
.el-main{
  height: calc(100vh);
}

img{
  height: 400px;
}
.imgTitle {
  color: white;
  font-size: 28px;
}
.el-form{
  width: 60%;
  margin: auto;
}
.loginTitle {
  text-align: center;
  margin-top: 120px;
  margin-bottom: 30px;
}
.el-button{
  text-align: center;
  width: 45%;
}

</style>