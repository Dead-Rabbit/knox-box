<style lang="less">
    @import './dynamic-banner.less';
</style>

<template>
    <div id="members" class="ui grid stackable">
      <!-- 人物详情 -->
      <div class="ten wide column">

        <div class="ui grid">
          <div class="nine wide column">
            <div class="ui special cards">
              <div class="card">
                <div class="blurring dimmable image">
                  <div class="ui dimmer">
                    <div class="content">
                      <div class="center">
                        <div class="ui primary button">加关注</div>
                      </div>
                    </div>
                  </div>
                  <img src="http://www.semantic-ui.cn/images/avatar/large/jenny.jpg">
                </div>
                <div class="content">
                  <a class="header">Team Fu</a>
                  <div class="meta">
                    <span class="date">Create in Sep 2014</span>
                  </div>
                </div>
                <div class="extra content">
                  <a><i class="users icon"></i> 2 Members </a>
                </div>
              </div>
            </div>
          </div>
          <div class="five wide column cards-center">
            <div class="ui container">
              <div class="ui accordion">
                <div class="title"><i class="dropdown icon"></i> 什么生物? </div>
                <div class="content">
                  <p class="transition hidden">狗算是一种家畜。以其忠诚与忠心广受人类欢迎, 可以在世界各地的许多家庭里发现这个受欢迎的客人。</p>
                </div>
                <div class="title"><i class="dropdown icon"></i>私密信息</div>
                <div class="content">
                  <p class="transition hidden">年龄:××</p>
                  <p class="transition hidden">性别:男</p>
                  <p class="transition hidden">身高:×××</p>
                </div>
                <div class="title"><i class="dropdown icon"></i> How do you acquire a dog? </div>
                <div class="content">
                  <p>通常有三种方式可以取得一只狗狗，宠物店、私人饲主或是动物之家。 (请以领养代替购买)</p>
                  <p>你可以在动物之家内领养一只健康的小狗，比起在宠物店买，收容所中的宠物比较不容易有近亲交配出现的缺陷问题，而且领养一只小狗的费用远比你在宠物店中购买便宜得多。</p>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>
      <!-- 人物动态 -->
      <div class="five wide column cards-right" style="">
        
        <div class="ui feed">
          <div class="event">
            <div class="label">
              <img src="http://www.semantic-ui.cn/images/avatar/large/jenny.jpg">
            </div>
            <div class="content">
              <div class="summary"><a class="user"> Elliot Fu </a> added you as a friend <div class="date">1 小时前 </div>
              </div>
              <div class="meta">
                <a class="like"><i class="like icon"></i> 4 Likes </a>
              </div>
            </div>
          </div>
          <div class="event">
            <div class="label">
              <img src="http://www.semantic-ui.cn/images/avatar/large/jenny.jpg">
            </div>
            <div class="content">
              <div class="summary"><a>Helen Troy</a> 增加 <a>2 新的 illustrations</a> <div class="date">4 天前 </div>
              </div>
              <div class="extra images">
                <a><img src="/images/wireframe/image.png"></a>
                <a><img src="/images/wireframe/image.png"></a>
              </div>
              <div class="meta">
                <a class="like"><i class="like icon"></i> 1 Like </a>
              </div>
            </div>
          </div>
          <div class="event">
            <div class="label">
              <img src="http://www.semantic-ui.cn/images/avatar/large/jenny.jpg">
            </div>
            <div class="content">
              <div class="summary"><a class="user"> Jenny Hess </a> 将你加为好友 <div class="date">2 天前 </div>
              </div>
              <div class="meta">
                <a class="like"><i class="like icon"></i> 8 Likes </a>
              </div>
            </div>
          </div>
          <div class="event">
            <div class="label">
              <img src="http://www.semantic-ui.cn/images/avatar/large/jenny.jpg">
            </div>
            <div class="content">
              <div class="summary"><a>Joe Henderson</a> posted on his page <div class="date">3 天前 </div>
              </div>
              <div class="extra text">Ours is a life of constant reruns. We're always circling back to where we'd we started, then starting all over again. Even if we don't run extra laps that day, we surely will come back for more of the same another day soon. </div>
              <div class="meta">
                <a class="like"><i class="like icon"></i> 5 Likes </a>
              </div>
            </div>
          </div>
          <div class="event">
            <div class="label">
              <img src="http://www.semantic-ui.cn/images/avatar/large/jenny.jpg">
            </div>
            <div class="content">
              <div class="summary"><a>Justen Kitsune</a> 上传 <a>2 张关于你的照片</a> <div class="date">4 天前 </div>
              </div>
              <div class="extra images">
                <a><img src="/images/wireframe/image.png"></a>
                <a><img src="/images/wireframe/image.png"></a>
              </div>
              <div class="meta">
                <a class="like"><i class="like icon"></i> 41 Likes </a>
              </div>
            </div>
          </div>
        </div>

      </div>

    </div>
</template>
<script>

export default {
    name: 'dynamicBanner',
    data () {
        return {

        };
    },
    methods: {

    }
};
</script>