@isTest
private class OASSharedAudienceAccountTest {
    @isTest
    private static void equalsSameInstance() {
        OASSharedAudienceAccount sharedAudienceAccount1 = OASSharedAudienceAccount.getExample();
        OASSharedAudienceAccount sharedAudienceAccount2 = sharedAudienceAccount1;
        OASSharedAudienceAccount sharedAudienceAccount3 = new OASSharedAudienceAccount();
        OASSharedAudienceAccount sharedAudienceAccount4 = sharedAudienceAccount3;

        System.assert(sharedAudienceAccount1.equals(sharedAudienceAccount2));
        System.assert(sharedAudienceAccount2.equals(sharedAudienceAccount1));
        System.assert(sharedAudienceAccount1.equals(sharedAudienceAccount1));
        System.assert(sharedAudienceAccount3.equals(sharedAudienceAccount4));
        System.assert(sharedAudienceAccount4.equals(sharedAudienceAccount3));
        System.assert(sharedAudienceAccount3.equals(sharedAudienceAccount3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSharedAudienceAccount sharedAudienceAccount1 = OASSharedAudienceAccount.getExample();
        OASSharedAudienceAccount sharedAudienceAccount2 = OASSharedAudienceAccount.getExample();
        OASSharedAudienceAccount sharedAudienceAccount3 = new OASSharedAudienceAccount();
        OASSharedAudienceAccount sharedAudienceAccount4 = new OASSharedAudienceAccount();

        System.assert(sharedAudienceAccount1.equals(sharedAudienceAccount2));
        System.assert(sharedAudienceAccount2.equals(sharedAudienceAccount1));
        System.assert(sharedAudienceAccount3.equals(sharedAudienceAccount4));
        System.assert(sharedAudienceAccount4.equals(sharedAudienceAccount3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSharedAudienceAccount sharedAudienceAccount1 = OASSharedAudienceAccount.getExample();
        OASSharedAudienceAccount sharedAudienceAccount2 = new OASSharedAudienceAccount();

        System.assertEquals(false, sharedAudienceAccount1.equals('foo'));
        System.assertEquals(false, sharedAudienceAccount2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSharedAudienceAccount sharedAudienceAccount1 = OASSharedAudienceAccount.getExample();
        OASSharedAudienceAccount sharedAudienceAccount2 = new OASSharedAudienceAccount();
        OASSharedAudienceAccount sharedAudienceAccount3;

        System.assertEquals(false, sharedAudienceAccount1.equals(sharedAudienceAccount3));
        System.assertEquals(false, sharedAudienceAccount2.equals(sharedAudienceAccount3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSharedAudienceAccount sharedAudienceAccount1 = OASSharedAudienceAccount.getExample();
        OASSharedAudienceAccount sharedAudienceAccount2 = new OASSharedAudienceAccount();

        System.assertEquals(sharedAudienceAccount1.hashCode(), sharedAudienceAccount1.hashCode());
        System.assertEquals(sharedAudienceAccount2.hashCode(), sharedAudienceAccount2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSharedAudienceAccount sharedAudienceAccount1 = OASSharedAudienceAccount.getExample();
        OASSharedAudienceAccount sharedAudienceAccount2 = OASSharedAudienceAccount.getExample();
        OASSharedAudienceAccount sharedAudienceAccount3 = new OASSharedAudienceAccount();
        OASSharedAudienceAccount sharedAudienceAccount4 = new OASSharedAudienceAccount();

        System.assert(sharedAudienceAccount1.equals(sharedAudienceAccount2));
        System.assert(sharedAudienceAccount3.equals(sharedAudienceAccount4));
        System.assertEquals(sharedAudienceAccount1.hashCode(), sharedAudienceAccount2.hashCode());
        System.assertEquals(sharedAudienceAccount3.hashCode(), sharedAudienceAccount4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSharedAudienceAccount sharedAudienceAccount = new OASSharedAudienceAccount();
        Map<String, String> x-property-mappings = sharedAudienceAccount.getx-property-mappings();
        System.assertEquals('accountId', x-property-mappings.get('account_id'));
        System.assertEquals('accountName', x-property-mappings.get('account_name'));
        System.assertEquals('accountType', x-property-mappings.get('account_type'));
        System.assertEquals('sharedOnTimestamp', x-property-mappings.get('shared_on_timestamp'));
    }
}
