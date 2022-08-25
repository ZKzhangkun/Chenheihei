package cn.ofpp;

import cn.ofpp.core.BoyFriend;
import cn.ofpp.core.GirlFriend;
import cn.ofpp.core.MessageFactory;
import cn.ofpp.core.Wx;

/**
 * 启动类
 *
 * 这个理论上只能用测试号 正式的号 个人认证是不支持模板消息的 企业认证的又必须使用微信模板库里的模板 只有测试的可以自定义模板内容
 * <a href="https://mp.weixin.qq.com/debug/cgi-bin/sandboxinfo?action=showinfo&t=sandbox/index">申请公众号测试应用地址</a>
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Application {

    /**
     * <li>创建配置</li>
     * <li>创建几个 男/女 朋友</li>
     * <li>发消息</li>
     */
    public static void main(String[] args) {
        // load and init
        Bootstrap.init();

        // -----------------  以下为演示数据  ------------------------

        // new 一个 女友
        GirlFriend girlFriend = new GirlFriend("陈欣",
                "新疆维吾尔自治区", "乌鲁木齐市", "1997-02-27", "2022-08-09", "o4DKp6IbhWPsoDflltZuBHW6G0BI");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend));

        // new 一个 男友 也可单独针对一个friend设置模板ID 以达到不同人不同消息
//        BoyFriend boyFriend = new BoyFriend("张坤",
//                "四川省", "成都市市", "1997-07-31", "2022-08-09", "oQFk-o4DKp6Hyj-OdJX_H_jyCey4U8Np4", "aab-kkHS4VEdulukh-pRX7E_Gcnp4BEq_cvMK1zNpkE");
//        Wx.sendTemplateMessage(MessageFactory.resolveMessage(boyFriend));
    }

}

