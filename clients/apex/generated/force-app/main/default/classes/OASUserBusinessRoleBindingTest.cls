@isTest
private class OASUserBusinessRoleBindingTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserBusinessRoleBinding userBusinessRoleBinding1 = OASUserBusinessRoleBinding.getExample();
        OASUserBusinessRoleBinding userBusinessRoleBinding2 = userBusinessRoleBinding1;
        OASUserBusinessRoleBinding userBusinessRoleBinding3 = new OASUserBusinessRoleBinding();
        OASUserBusinessRoleBinding userBusinessRoleBinding4 = userBusinessRoleBinding3;

        System.assert(userBusinessRoleBinding1.equals(userBusinessRoleBinding2));
        System.assert(userBusinessRoleBinding2.equals(userBusinessRoleBinding1));
        System.assert(userBusinessRoleBinding1.equals(userBusinessRoleBinding1));
        System.assert(userBusinessRoleBinding3.equals(userBusinessRoleBinding4));
        System.assert(userBusinessRoleBinding4.equals(userBusinessRoleBinding3));
        System.assert(userBusinessRoleBinding3.equals(userBusinessRoleBinding3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserBusinessRoleBinding userBusinessRoleBinding1 = OASUserBusinessRoleBinding.getExample();
        OASUserBusinessRoleBinding userBusinessRoleBinding2 = OASUserBusinessRoleBinding.getExample();
        OASUserBusinessRoleBinding userBusinessRoleBinding3 = new OASUserBusinessRoleBinding();
        OASUserBusinessRoleBinding userBusinessRoleBinding4 = new OASUserBusinessRoleBinding();

        System.assert(userBusinessRoleBinding1.equals(userBusinessRoleBinding2));
        System.assert(userBusinessRoleBinding2.equals(userBusinessRoleBinding1));
        System.assert(userBusinessRoleBinding3.equals(userBusinessRoleBinding4));
        System.assert(userBusinessRoleBinding4.equals(userBusinessRoleBinding3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserBusinessRoleBinding userBusinessRoleBinding1 = OASUserBusinessRoleBinding.getExample();
        OASUserBusinessRoleBinding userBusinessRoleBinding2 = new OASUserBusinessRoleBinding();

        System.assertEquals(false, userBusinessRoleBinding1.equals('foo'));
        System.assertEquals(false, userBusinessRoleBinding2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserBusinessRoleBinding userBusinessRoleBinding1 = OASUserBusinessRoleBinding.getExample();
        OASUserBusinessRoleBinding userBusinessRoleBinding2 = new OASUserBusinessRoleBinding();
        OASUserBusinessRoleBinding userBusinessRoleBinding3;

        System.assertEquals(false, userBusinessRoleBinding1.equals(userBusinessRoleBinding3));
        System.assertEquals(false, userBusinessRoleBinding2.equals(userBusinessRoleBinding3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserBusinessRoleBinding userBusinessRoleBinding1 = OASUserBusinessRoleBinding.getExample();
        OASUserBusinessRoleBinding userBusinessRoleBinding2 = new OASUserBusinessRoleBinding();

        System.assertEquals(userBusinessRoleBinding1.hashCode(), userBusinessRoleBinding1.hashCode());
        System.assertEquals(userBusinessRoleBinding2.hashCode(), userBusinessRoleBinding2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserBusinessRoleBinding userBusinessRoleBinding1 = OASUserBusinessRoleBinding.getExample();
        OASUserBusinessRoleBinding userBusinessRoleBinding2 = OASUserBusinessRoleBinding.getExample();
        OASUserBusinessRoleBinding userBusinessRoleBinding3 = new OASUserBusinessRoleBinding();
        OASUserBusinessRoleBinding userBusinessRoleBinding4 = new OASUserBusinessRoleBinding();

        System.assert(userBusinessRoleBinding1.equals(userBusinessRoleBinding2));
        System.assert(userBusinessRoleBinding3.equals(userBusinessRoleBinding4));
        System.assertEquals(userBusinessRoleBinding1.hashCode(), userBusinessRoleBinding2.hashCode());
        System.assertEquals(userBusinessRoleBinding3.hashCode(), userBusinessRoleBinding4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUserBusinessRoleBinding userBusinessRoleBinding = new OASUserBusinessRoleBinding();
        Map<String, String> x-property-mappings = userBusinessRoleBinding.getx-property-mappings();
        System.assertEquals('assetsSummary', x-property-mappings.get('assets_summary'));
        System.assertEquals('businessRoles', x-property-mappings.get('business_roles'));
        System.assertEquals('createdByBusiness', x-property-mappings.get('created_by_business'));
        System.assertEquals('createdByUser', x-property-mappings.get('created_by_user'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('isSharedPartner', x-property-mappings.get('is_shared_partner'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUserBusinessRoleBinding userBusinessRoleBinding = new OASUserBusinessRoleBinding();
        System.assertEquals(new List<String>(), userBusinessRoleBinding.businessRoles);
        System.assertEquals(null, userBusinessRoleBinding.assetsSummary);
        System.assertEquals(null, userBusinessRoleBinding.createdByBusiness);
        System.assertEquals(null, userBusinessRoleBinding.createdByUser);
        System.assertEquals(null, userBusinessRoleBinding.createdTime);
        System.assertEquals(null, userBusinessRoleBinding.id);
        System.assertEquals(null, userBusinessRoleBinding.isSharedPartner);
        System.assertEquals(null, userBusinessRoleBinding.user);
    }
}
