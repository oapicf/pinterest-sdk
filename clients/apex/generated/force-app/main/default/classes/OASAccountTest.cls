@isTest
private class OASAccountTest {
    @isTest
    private static void equalsSameInstance() {
        OASAccount account1 = OASAccount.getExample();
        OASAccount account2 = account1;
        OASAccount account3 = new OASAccount();
        OASAccount account4 = account3;

        System.assert(account1.equals(account2));
        System.assert(account2.equals(account1));
        System.assert(account1.equals(account1));
        System.assert(account3.equals(account4));
        System.assert(account4.equals(account3));
        System.assert(account3.equals(account3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAccount account1 = OASAccount.getExample();
        OASAccount account2 = OASAccount.getExample();
        OASAccount account3 = new OASAccount();
        OASAccount account4 = new OASAccount();

        System.assert(account1.equals(account2));
        System.assert(account2.equals(account1));
        System.assert(account3.equals(account4));
        System.assert(account4.equals(account3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAccount account1 = OASAccount.getExample();
        OASAccount account2 = new OASAccount();

        System.assertEquals(false, account1.equals('foo'));
        System.assertEquals(false, account2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAccount account1 = OASAccount.getExample();
        OASAccount account2 = new OASAccount();
        OASAccount account3;

        System.assertEquals(false, account1.equals(account3));
        System.assertEquals(false, account2.equals(account3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAccount account1 = OASAccount.getExample();
        OASAccount account2 = new OASAccount();

        System.assertEquals(account1.hashCode(), account1.hashCode());
        System.assertEquals(account2.hashCode(), account2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAccount account1 = OASAccount.getExample();
        OASAccount account2 = OASAccount.getExample();
        OASAccount account3 = new OASAccount();
        OASAccount account4 = new OASAccount();

        System.assert(account1.equals(account2));
        System.assert(account3.equals(account4));
        System.assertEquals(account1.hashCode(), account2.hashCode());
        System.assertEquals(account3.hashCode(), account4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAccount account = new OASAccount();
        Map<String, String> x-property-mappings = account.getx-property-mappings();
        System.assertEquals('accountType', x-property-mappings.get('account_type'));
        System.assertEquals('profileImage', x-property-mappings.get('profile_image'));
        System.assertEquals('websiteUrl', x-property-mappings.get('website_url'));
        System.assertEquals('businessName', x-property-mappings.get('business_name'));
        System.assertEquals('boardCount', x-property-mappings.get('board_count'));
        System.assertEquals('pinCount', x-property-mappings.get('pin_count'));
        System.assertEquals('followerCount', x-property-mappings.get('follower_count'));
        System.assertEquals('followingCount', x-property-mappings.get('following_count'));
        System.assertEquals('monthlyViews', x-property-mappings.get('monthly_views'));
    }
}
