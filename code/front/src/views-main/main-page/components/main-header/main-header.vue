<style lang="less">
    @import './main-header.less';
</style>

<template>
    <div id="xiao-top" class="ui secondary menu xiao-top fixed xiao-transition" >
      <a class="item"><i class="icon iconfont icon-nuokezuofangtubiao" style="display: block;margin:0 auto;font-size: 4em;line-height: 1em"></i></a>
      <a class="item active">首页</a>
      <a class="item">作品</a>
      <a class="item">资源</a>
      <a class="item">活动</a>
      <div class="right menu">
        <div class="item">
          <div class="ui icon input">
            <input type="text" placeholder="Search...">
            <i class="search link icon"></i>
          </div>
        </div>
        <a class="ui item ">登入</a>
      </div>
    </div>
</template>
<script>

export default {
    name: 'mainHeader',
    data () {
        return {

        };
    },
    methods: {

    }
};
</script>