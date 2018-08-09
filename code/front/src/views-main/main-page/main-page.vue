<style lang="less">
    @import './main-page.less';
</style>

<template>
    <div>
        <!-- header -->
        <mainHeader></mainHeader>
        <!-- 动态模块 -->
        <dynamicBanner></dynamicBanner>
    </div>
</template>

<script>
import mainHeader from './components/main-header/main-header.vue';
import dynamicBanner from './components/dynamic-banner/dynamic-banner.vue';

export default {
    components: {
        mainHeader, dynamicBanner
    },
    data () {
        return {

        };
    },
    methods: {

    }
};
</script>