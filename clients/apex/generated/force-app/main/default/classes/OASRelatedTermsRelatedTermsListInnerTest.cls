@isTest
private class OASRelatedTermsRelatedTermsListInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner1 = OASRelatedTermsRelatedTermsListInner.getExample();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner2 = relatedTermsRelatedTermsListInner1;
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner3 = new OASRelatedTermsRelatedTermsListInner();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner4 = relatedTermsRelatedTermsListInner3;

        System.assert(relatedTermsRelatedTermsListInner1.equals(relatedTermsRelatedTermsListInner2));
        System.assert(relatedTermsRelatedTermsListInner2.equals(relatedTermsRelatedTermsListInner1));
        System.assert(relatedTermsRelatedTermsListInner1.equals(relatedTermsRelatedTermsListInner1));
        System.assert(relatedTermsRelatedTermsListInner3.equals(relatedTermsRelatedTermsListInner4));
        System.assert(relatedTermsRelatedTermsListInner4.equals(relatedTermsRelatedTermsListInner3));
        System.assert(relatedTermsRelatedTermsListInner3.equals(relatedTermsRelatedTermsListInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner1 = OASRelatedTermsRelatedTermsListInner.getExample();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner2 = OASRelatedTermsRelatedTermsListInner.getExample();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner3 = new OASRelatedTermsRelatedTermsListInner();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner4 = new OASRelatedTermsRelatedTermsListInner();

        System.assert(relatedTermsRelatedTermsListInner1.equals(relatedTermsRelatedTermsListInner2));
        System.assert(relatedTermsRelatedTermsListInner2.equals(relatedTermsRelatedTermsListInner1));
        System.assert(relatedTermsRelatedTermsListInner3.equals(relatedTermsRelatedTermsListInner4));
        System.assert(relatedTermsRelatedTermsListInner4.equals(relatedTermsRelatedTermsListInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner1 = OASRelatedTermsRelatedTermsListInner.getExample();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner2 = new OASRelatedTermsRelatedTermsListInner();

        System.assertEquals(false, relatedTermsRelatedTermsListInner1.equals('foo'));
        System.assertEquals(false, relatedTermsRelatedTermsListInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner1 = OASRelatedTermsRelatedTermsListInner.getExample();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner2 = new OASRelatedTermsRelatedTermsListInner();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner3;

        System.assertEquals(false, relatedTermsRelatedTermsListInner1.equals(relatedTermsRelatedTermsListInner3));
        System.assertEquals(false, relatedTermsRelatedTermsListInner2.equals(relatedTermsRelatedTermsListInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner1 = OASRelatedTermsRelatedTermsListInner.getExample();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner2 = new OASRelatedTermsRelatedTermsListInner();

        System.assertEquals(relatedTermsRelatedTermsListInner1.hashCode(), relatedTermsRelatedTermsListInner1.hashCode());
        System.assertEquals(relatedTermsRelatedTermsListInner2.hashCode(), relatedTermsRelatedTermsListInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner1 = OASRelatedTermsRelatedTermsListInner.getExample();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner2 = OASRelatedTermsRelatedTermsListInner.getExample();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner3 = new OASRelatedTermsRelatedTermsListInner();
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner4 = new OASRelatedTermsRelatedTermsListInner();

        System.assert(relatedTermsRelatedTermsListInner1.equals(relatedTermsRelatedTermsListInner2));
        System.assert(relatedTermsRelatedTermsListInner3.equals(relatedTermsRelatedTermsListInner4));
        System.assertEquals(relatedTermsRelatedTermsListInner1.hashCode(), relatedTermsRelatedTermsListInner2.hashCode());
        System.assertEquals(relatedTermsRelatedTermsListInner3.hashCode(), relatedTermsRelatedTermsListInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner = new OASRelatedTermsRelatedTermsListInner();
        Map<String, String> x-property-mappings = relatedTermsRelatedTermsListInner.getx-property-mappings();
        System.assertEquals('relatedTerms', x-property-mappings.get('related_terms'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner = new OASRelatedTermsRelatedTermsListInner();
        System.assertEquals(new List<String>(), relatedTermsRelatedTermsListInner.relatedTerms);
        System.assertEquals(null, relatedTermsRelatedTermsListInner.term);
    }
}
