@isTest
private class OASAdAccountsCatalogsProductGroupsLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response1 = OASAdAccountsCatalogsProductGroupsLi.getExample();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response2 = adAccountsCatalogsProductGroupsList200Response1;
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response3 = new OASAdAccountsCatalogsProductGroupsLi();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response4 = adAccountsCatalogsProductGroupsList200Response3;

        System.assert(adAccountsCatalogsProductGroupsList200Response1.equals(adAccountsCatalogsProductGroupsList200Response2));
        System.assert(adAccountsCatalogsProductGroupsList200Response2.equals(adAccountsCatalogsProductGroupsList200Response1));
        System.assert(adAccountsCatalogsProductGroupsList200Response1.equals(adAccountsCatalogsProductGroupsList200Response1));
        System.assert(adAccountsCatalogsProductGroupsList200Response3.equals(adAccountsCatalogsProductGroupsList200Response4));
        System.assert(adAccountsCatalogsProductGroupsList200Response4.equals(adAccountsCatalogsProductGroupsList200Response3));
        System.assert(adAccountsCatalogsProductGroupsList200Response3.equals(adAccountsCatalogsProductGroupsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response1 = OASAdAccountsCatalogsProductGroupsLi.getExample();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response2 = OASAdAccountsCatalogsProductGroupsLi.getExample();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response3 = new OASAdAccountsCatalogsProductGroupsLi();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response4 = new OASAdAccountsCatalogsProductGroupsLi();

        System.assert(adAccountsCatalogsProductGroupsList200Response1.equals(adAccountsCatalogsProductGroupsList200Response2));
        System.assert(adAccountsCatalogsProductGroupsList200Response2.equals(adAccountsCatalogsProductGroupsList200Response1));
        System.assert(adAccountsCatalogsProductGroupsList200Response3.equals(adAccountsCatalogsProductGroupsList200Response4));
        System.assert(adAccountsCatalogsProductGroupsList200Response4.equals(adAccountsCatalogsProductGroupsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response1 = OASAdAccountsCatalogsProductGroupsLi.getExample();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response2 = new OASAdAccountsCatalogsProductGroupsLi();

        System.assertEquals(false, adAccountsCatalogsProductGroupsList200Response1.equals('foo'));
        System.assertEquals(false, adAccountsCatalogsProductGroupsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response1 = OASAdAccountsCatalogsProductGroupsLi.getExample();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response2 = new OASAdAccountsCatalogsProductGroupsLi();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response3;

        System.assertEquals(false, adAccountsCatalogsProductGroupsList200Response1.equals(adAccountsCatalogsProductGroupsList200Response3));
        System.assertEquals(false, adAccountsCatalogsProductGroupsList200Response2.equals(adAccountsCatalogsProductGroupsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response1 = OASAdAccountsCatalogsProductGroupsLi.getExample();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response2 = new OASAdAccountsCatalogsProductGroupsLi();

        System.assertEquals(adAccountsCatalogsProductGroupsList200Response1.hashCode(), adAccountsCatalogsProductGroupsList200Response1.hashCode());
        System.assertEquals(adAccountsCatalogsProductGroupsList200Response2.hashCode(), adAccountsCatalogsProductGroupsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response1 = OASAdAccountsCatalogsProductGroupsLi.getExample();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response2 = OASAdAccountsCatalogsProductGroupsLi.getExample();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response3 = new OASAdAccountsCatalogsProductGroupsLi();
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response4 = new OASAdAccountsCatalogsProductGroupsLi();

        System.assert(adAccountsCatalogsProductGroupsList200Response1.equals(adAccountsCatalogsProductGroupsList200Response2));
        System.assert(adAccountsCatalogsProductGroupsList200Response3.equals(adAccountsCatalogsProductGroupsList200Response4));
        System.assertEquals(adAccountsCatalogsProductGroupsList200Response1.hashCode(), adAccountsCatalogsProductGroupsList200Response2.hashCode());
        System.assertEquals(adAccountsCatalogsProductGroupsList200Response3.hashCode(), adAccountsCatalogsProductGroupsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdAccountsCatalogsProductGroupsLi adAccountsCatalogsProductGroupsList200Response = new OASAdAccountsCatalogsProductGroupsLi();
        System.assertEquals(new List<OASCatalogProductGroup>(), adAccountsCatalogsProductGroupsList200Response.items);
        System.assertEquals(null, adAccountsCatalogsProductGroupsList200Response.bookmark);
    }
}
