//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsBaseFilterKeys {
  /// Returns a new [CatalogsBaseFilterKeys] instance.
  CatalogsBaseFilterKeys({
    required this.MIN_PRICE,
    required this.MAX_PRICE,
    required this.CURRENCY,
    required this.ITEM_ID,
    required this.AVAILABILITY,
    required this.BRAND,
    required this.CONDITION,
    required this.CUSTOM_LABEL_0,
    required this.CUSTOM_LABEL_1,
    required this.CUSTOM_LABEL_2,
    required this.CUSTOM_LABEL_3,
    required this.CUSTOM_LABEL_4,
    required this.ITEM_GROUP_ID,
    required this.GENDER,
    required this.MEDIA_TYPE,
    required this.PRODUCT_TYPE_4,
    required this.PRODUCT_TYPE_3,
    required this.PRODUCT_TYPE_2,
    required this.PRODUCT_TYPE_1,
    required this.PRODUCT_TYPE_0,
    required this.GOOGLE_PRODUCT_CATEGORY_6,
    required this.GOOGLE_PRODUCT_CATEGORY_5,
    required this.GOOGLE_PRODUCT_CATEGORY_4,
    required this.GOOGLE_PRODUCT_CATEGORY_3,
    required this.GOOGLE_PRODUCT_CATEGORY_2,
    required this.GOOGLE_PRODUCT_CATEGORY_1,
    required this.GOOGLE_PRODUCT_CATEGORY_0,
    required this.CUSTOM_NUMBER_0,
    required this.CUSTOM_NUMBER_1,
    required this.CUSTOM_NUMBER_2,
    required this.CUSTOM_NUMBER_3,
    required this.CUSTOM_NUMBER_4,
    required this.TITLE_KEYWORDS,
    required this.PINTEREST_PRODUCT_CATEGORIES,
  });

  CatalogsProductGroupPricingCriteria MIN_PRICE;

  CatalogsProductGroupPricingCriteria MAX_PRICE;

  CatalogsProductGroupCurrencyCriteria CURRENCY;

  CatalogsProductGroupMultipleStringCriteria ITEM_ID;

  CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

  CatalogsProductGroupMultipleStringCriteria BRAND;

  CatalogsProductGroupMultipleStringCriteria CONDITION;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4;

  CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;

  CatalogsProductGroupMultipleGenderCriteria GENDER;

  CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;

  CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4;

  CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3;

  CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2;

  CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1;

  CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0;

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6;

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2;

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;

  CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0;

  CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1;

  CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2;

  CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3;

  CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4;

  CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

  CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsBaseFilterKeys &&
    other.MIN_PRICE == MIN_PRICE &&
    other.MAX_PRICE == MAX_PRICE &&
    other.CURRENCY == CURRENCY &&
    other.ITEM_ID == ITEM_ID &&
    other.AVAILABILITY == AVAILABILITY &&
    other.BRAND == BRAND &&
    other.CONDITION == CONDITION &&
    other.CUSTOM_LABEL_0 == CUSTOM_LABEL_0 &&
    other.CUSTOM_LABEL_1 == CUSTOM_LABEL_1 &&
    other.CUSTOM_LABEL_2 == CUSTOM_LABEL_2 &&
    other.CUSTOM_LABEL_3 == CUSTOM_LABEL_3 &&
    other.CUSTOM_LABEL_4 == CUSTOM_LABEL_4 &&
    other.ITEM_GROUP_ID == ITEM_GROUP_ID &&
    other.GENDER == GENDER &&
    other.MEDIA_TYPE == MEDIA_TYPE &&
    other.PRODUCT_TYPE_4 == PRODUCT_TYPE_4 &&
    other.PRODUCT_TYPE_3 == PRODUCT_TYPE_3 &&
    other.PRODUCT_TYPE_2 == PRODUCT_TYPE_2 &&
    other.PRODUCT_TYPE_1 == PRODUCT_TYPE_1 &&
    other.PRODUCT_TYPE_0 == PRODUCT_TYPE_0 &&
    other.GOOGLE_PRODUCT_CATEGORY_6 == GOOGLE_PRODUCT_CATEGORY_6 &&
    other.GOOGLE_PRODUCT_CATEGORY_5 == GOOGLE_PRODUCT_CATEGORY_5 &&
    other.GOOGLE_PRODUCT_CATEGORY_4 == GOOGLE_PRODUCT_CATEGORY_4 &&
    other.GOOGLE_PRODUCT_CATEGORY_3 == GOOGLE_PRODUCT_CATEGORY_3 &&
    other.GOOGLE_PRODUCT_CATEGORY_2 == GOOGLE_PRODUCT_CATEGORY_2 &&
    other.GOOGLE_PRODUCT_CATEGORY_1 == GOOGLE_PRODUCT_CATEGORY_1 &&
    other.GOOGLE_PRODUCT_CATEGORY_0 == GOOGLE_PRODUCT_CATEGORY_0 &&
    other.CUSTOM_NUMBER_0 == CUSTOM_NUMBER_0 &&
    other.CUSTOM_NUMBER_1 == CUSTOM_NUMBER_1 &&
    other.CUSTOM_NUMBER_2 == CUSTOM_NUMBER_2 &&
    other.CUSTOM_NUMBER_3 == CUSTOM_NUMBER_3 &&
    other.CUSTOM_NUMBER_4 == CUSTOM_NUMBER_4 &&
    other.TITLE_KEYWORDS == TITLE_KEYWORDS &&
    other.PINTEREST_PRODUCT_CATEGORIES == PINTEREST_PRODUCT_CATEGORIES;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (MIN_PRICE.hashCode) +
    (MAX_PRICE.hashCode) +
    (CURRENCY.hashCode) +
    (ITEM_ID.hashCode) +
    (AVAILABILITY.hashCode) +
    (BRAND.hashCode) +
    (CONDITION.hashCode) +
    (CUSTOM_LABEL_0.hashCode) +
    (CUSTOM_LABEL_1.hashCode) +
    (CUSTOM_LABEL_2.hashCode) +
    (CUSTOM_LABEL_3.hashCode) +
    (CUSTOM_LABEL_4.hashCode) +
    (ITEM_GROUP_ID.hashCode) +
    (GENDER.hashCode) +
    (MEDIA_TYPE.hashCode) +
    (PRODUCT_TYPE_4.hashCode) +
    (PRODUCT_TYPE_3.hashCode) +
    (PRODUCT_TYPE_2.hashCode) +
    (PRODUCT_TYPE_1.hashCode) +
    (PRODUCT_TYPE_0.hashCode) +
    (GOOGLE_PRODUCT_CATEGORY_6.hashCode) +
    (GOOGLE_PRODUCT_CATEGORY_5.hashCode) +
    (GOOGLE_PRODUCT_CATEGORY_4.hashCode) +
    (GOOGLE_PRODUCT_CATEGORY_3.hashCode) +
    (GOOGLE_PRODUCT_CATEGORY_2.hashCode) +
    (GOOGLE_PRODUCT_CATEGORY_1.hashCode) +
    (GOOGLE_PRODUCT_CATEGORY_0.hashCode) +
    (CUSTOM_NUMBER_0.hashCode) +
    (CUSTOM_NUMBER_1.hashCode) +
    (CUSTOM_NUMBER_2.hashCode) +
    (CUSTOM_NUMBER_3.hashCode) +
    (CUSTOM_NUMBER_4.hashCode) +
    (TITLE_KEYWORDS.hashCode) +
    (PINTEREST_PRODUCT_CATEGORIES.hashCode);

  @override
  String toString() => 'CatalogsBaseFilterKeys[MIN_PRICE=$MIN_PRICE, MAX_PRICE=$MAX_PRICE, CURRENCY=$CURRENCY, ITEM_ID=$ITEM_ID, AVAILABILITY=$AVAILABILITY, BRAND=$BRAND, CONDITION=$CONDITION, CUSTOM_LABEL_0=$CUSTOM_LABEL_0, CUSTOM_LABEL_1=$CUSTOM_LABEL_1, CUSTOM_LABEL_2=$CUSTOM_LABEL_2, CUSTOM_LABEL_3=$CUSTOM_LABEL_3, CUSTOM_LABEL_4=$CUSTOM_LABEL_4, ITEM_GROUP_ID=$ITEM_GROUP_ID, GENDER=$GENDER, MEDIA_TYPE=$MEDIA_TYPE, PRODUCT_TYPE_4=$PRODUCT_TYPE_4, PRODUCT_TYPE_3=$PRODUCT_TYPE_3, PRODUCT_TYPE_2=$PRODUCT_TYPE_2, PRODUCT_TYPE_1=$PRODUCT_TYPE_1, PRODUCT_TYPE_0=$PRODUCT_TYPE_0, GOOGLE_PRODUCT_CATEGORY_6=$GOOGLE_PRODUCT_CATEGORY_6, GOOGLE_PRODUCT_CATEGORY_5=$GOOGLE_PRODUCT_CATEGORY_5, GOOGLE_PRODUCT_CATEGORY_4=$GOOGLE_PRODUCT_CATEGORY_4, GOOGLE_PRODUCT_CATEGORY_3=$GOOGLE_PRODUCT_CATEGORY_3, GOOGLE_PRODUCT_CATEGORY_2=$GOOGLE_PRODUCT_CATEGORY_2, GOOGLE_PRODUCT_CATEGORY_1=$GOOGLE_PRODUCT_CATEGORY_1, GOOGLE_PRODUCT_CATEGORY_0=$GOOGLE_PRODUCT_CATEGORY_0, CUSTOM_NUMBER_0=$CUSTOM_NUMBER_0, CUSTOM_NUMBER_1=$CUSTOM_NUMBER_1, CUSTOM_NUMBER_2=$CUSTOM_NUMBER_2, CUSTOM_NUMBER_3=$CUSTOM_NUMBER_3, CUSTOM_NUMBER_4=$CUSTOM_NUMBER_4, TITLE_KEYWORDS=$TITLE_KEYWORDS, PINTEREST_PRODUCT_CATEGORIES=$PINTEREST_PRODUCT_CATEGORIES]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'MIN_PRICE'] = this.MIN_PRICE;
      json[r'MAX_PRICE'] = this.MAX_PRICE;
      json[r'CURRENCY'] = this.CURRENCY;
      json[r'ITEM_ID'] = this.ITEM_ID;
      json[r'AVAILABILITY'] = this.AVAILABILITY;
      json[r'BRAND'] = this.BRAND;
      json[r'CONDITION'] = this.CONDITION;
      json[r'CUSTOM_LABEL_0'] = this.CUSTOM_LABEL_0;
      json[r'CUSTOM_LABEL_1'] = this.CUSTOM_LABEL_1;
      json[r'CUSTOM_LABEL_2'] = this.CUSTOM_LABEL_2;
      json[r'CUSTOM_LABEL_3'] = this.CUSTOM_LABEL_3;
      json[r'CUSTOM_LABEL_4'] = this.CUSTOM_LABEL_4;
      json[r'ITEM_GROUP_ID'] = this.ITEM_GROUP_ID;
      json[r'GENDER'] = this.GENDER;
      json[r'MEDIA_TYPE'] = this.MEDIA_TYPE;
      json[r'PRODUCT_TYPE_4'] = this.PRODUCT_TYPE_4;
      json[r'PRODUCT_TYPE_3'] = this.PRODUCT_TYPE_3;
      json[r'PRODUCT_TYPE_2'] = this.PRODUCT_TYPE_2;
      json[r'PRODUCT_TYPE_1'] = this.PRODUCT_TYPE_1;
      json[r'PRODUCT_TYPE_0'] = this.PRODUCT_TYPE_0;
      json[r'GOOGLE_PRODUCT_CATEGORY_6'] = this.GOOGLE_PRODUCT_CATEGORY_6;
      json[r'GOOGLE_PRODUCT_CATEGORY_5'] = this.GOOGLE_PRODUCT_CATEGORY_5;
      json[r'GOOGLE_PRODUCT_CATEGORY_4'] = this.GOOGLE_PRODUCT_CATEGORY_4;
      json[r'GOOGLE_PRODUCT_CATEGORY_3'] = this.GOOGLE_PRODUCT_CATEGORY_3;
      json[r'GOOGLE_PRODUCT_CATEGORY_2'] = this.GOOGLE_PRODUCT_CATEGORY_2;
      json[r'GOOGLE_PRODUCT_CATEGORY_1'] = this.GOOGLE_PRODUCT_CATEGORY_1;
      json[r'GOOGLE_PRODUCT_CATEGORY_0'] = this.GOOGLE_PRODUCT_CATEGORY_0;
      json[r'CUSTOM_NUMBER_0'] = this.CUSTOM_NUMBER_0;
      json[r'CUSTOM_NUMBER_1'] = this.CUSTOM_NUMBER_1;
      json[r'CUSTOM_NUMBER_2'] = this.CUSTOM_NUMBER_2;
      json[r'CUSTOM_NUMBER_3'] = this.CUSTOM_NUMBER_3;
      json[r'CUSTOM_NUMBER_4'] = this.CUSTOM_NUMBER_4;
      json[r'TITLE_KEYWORDS'] = this.TITLE_KEYWORDS;
      json[r'PINTEREST_PRODUCT_CATEGORIES'] = this.PINTEREST_PRODUCT_CATEGORIES;
    return json;
  }

  /// Returns a new [CatalogsBaseFilterKeys] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsBaseFilterKeys? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'MIN_PRICE'), 'Required key "CatalogsBaseFilterKeys[MIN_PRICE]" is missing from JSON.');
        assert(json[r'MIN_PRICE'] != null, 'Required key "CatalogsBaseFilterKeys[MIN_PRICE]" has a null value in JSON.');
        assert(json.containsKey(r'MAX_PRICE'), 'Required key "CatalogsBaseFilterKeys[MAX_PRICE]" is missing from JSON.');
        assert(json[r'MAX_PRICE'] != null, 'Required key "CatalogsBaseFilterKeys[MAX_PRICE]" has a null value in JSON.');
        assert(json.containsKey(r'CURRENCY'), 'Required key "CatalogsBaseFilterKeys[CURRENCY]" is missing from JSON.');
        assert(json[r'CURRENCY'] != null, 'Required key "CatalogsBaseFilterKeys[CURRENCY]" has a null value in JSON.');
        assert(json.containsKey(r'ITEM_ID'), 'Required key "CatalogsBaseFilterKeys[ITEM_ID]" is missing from JSON.');
        assert(json[r'ITEM_ID'] != null, 'Required key "CatalogsBaseFilterKeys[ITEM_ID]" has a null value in JSON.');
        assert(json.containsKey(r'AVAILABILITY'), 'Required key "CatalogsBaseFilterKeys[AVAILABILITY]" is missing from JSON.');
        assert(json[r'AVAILABILITY'] != null, 'Required key "CatalogsBaseFilterKeys[AVAILABILITY]" has a null value in JSON.');
        assert(json.containsKey(r'BRAND'), 'Required key "CatalogsBaseFilterKeys[BRAND]" is missing from JSON.');
        assert(json[r'BRAND'] != null, 'Required key "CatalogsBaseFilterKeys[BRAND]" has a null value in JSON.');
        assert(json.containsKey(r'CONDITION'), 'Required key "CatalogsBaseFilterKeys[CONDITION]" is missing from JSON.');
        assert(json[r'CONDITION'] != null, 'Required key "CatalogsBaseFilterKeys[CONDITION]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_0'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_0]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_0'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_0]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_1'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_1]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_1'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_1]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_2'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_2]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_2'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_2]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_3'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_3]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_3'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_3]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_4'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_4]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_4'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_LABEL_4]" has a null value in JSON.');
        assert(json.containsKey(r'ITEM_GROUP_ID'), 'Required key "CatalogsBaseFilterKeys[ITEM_GROUP_ID]" is missing from JSON.');
        assert(json[r'ITEM_GROUP_ID'] != null, 'Required key "CatalogsBaseFilterKeys[ITEM_GROUP_ID]" has a null value in JSON.');
        assert(json.containsKey(r'GENDER'), 'Required key "CatalogsBaseFilterKeys[GENDER]" is missing from JSON.');
        assert(json[r'GENDER'] != null, 'Required key "CatalogsBaseFilterKeys[GENDER]" has a null value in JSON.');
        assert(json.containsKey(r'MEDIA_TYPE'), 'Required key "CatalogsBaseFilterKeys[MEDIA_TYPE]" is missing from JSON.');
        assert(json[r'MEDIA_TYPE'] != null, 'Required key "CatalogsBaseFilterKeys[MEDIA_TYPE]" has a null value in JSON.');
        assert(json.containsKey(r'PRODUCT_TYPE_4'), 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_4]" is missing from JSON.');
        assert(json[r'PRODUCT_TYPE_4'] != null, 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_4]" has a null value in JSON.');
        assert(json.containsKey(r'PRODUCT_TYPE_3'), 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_3]" is missing from JSON.');
        assert(json[r'PRODUCT_TYPE_3'] != null, 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_3]" has a null value in JSON.');
        assert(json.containsKey(r'PRODUCT_TYPE_2'), 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_2]" is missing from JSON.');
        assert(json[r'PRODUCT_TYPE_2'] != null, 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_2]" has a null value in JSON.');
        assert(json.containsKey(r'PRODUCT_TYPE_1'), 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_1]" is missing from JSON.');
        assert(json[r'PRODUCT_TYPE_1'] != null, 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_1]" has a null value in JSON.');
        assert(json.containsKey(r'PRODUCT_TYPE_0'), 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_0]" is missing from JSON.');
        assert(json[r'PRODUCT_TYPE_0'] != null, 'Required key "CatalogsBaseFilterKeys[PRODUCT_TYPE_0]" has a null value in JSON.');
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_6'), 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_6]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_6'] != null, 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_6]" has a null value in JSON.');
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_5'), 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_5]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_5'] != null, 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_5]" has a null value in JSON.');
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_4'), 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_4]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_4'] != null, 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_4]" has a null value in JSON.');
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_3'), 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_3]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_3'] != null, 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_3]" has a null value in JSON.');
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_2'), 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_2]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_2'] != null, 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_2]" has a null value in JSON.');
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_1'), 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_1]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_1'] != null, 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_1]" has a null value in JSON.');
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_0'), 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_0]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_0'] != null, 'Required key "CatalogsBaseFilterKeys[GOOGLE_PRODUCT_CATEGORY_0]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_NUMBER_0'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_0]" is missing from JSON.');
        assert(json[r'CUSTOM_NUMBER_0'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_0]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_NUMBER_1'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_1]" is missing from JSON.');
        assert(json[r'CUSTOM_NUMBER_1'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_1]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_NUMBER_2'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_2]" is missing from JSON.');
        assert(json[r'CUSTOM_NUMBER_2'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_2]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_NUMBER_3'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_3]" is missing from JSON.');
        assert(json[r'CUSTOM_NUMBER_3'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_3]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_NUMBER_4'), 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_4]" is missing from JSON.');
        assert(json[r'CUSTOM_NUMBER_4'] != null, 'Required key "CatalogsBaseFilterKeys[CUSTOM_NUMBER_4]" has a null value in JSON.');
        assert(json.containsKey(r'TITLE_KEYWORDS'), 'Required key "CatalogsBaseFilterKeys[TITLE_KEYWORDS]" is missing from JSON.');
        assert(json[r'TITLE_KEYWORDS'] != null, 'Required key "CatalogsBaseFilterKeys[TITLE_KEYWORDS]" has a null value in JSON.');
        assert(json.containsKey(r'PINTEREST_PRODUCT_CATEGORIES'), 'Required key "CatalogsBaseFilterKeys[PINTEREST_PRODUCT_CATEGORIES]" is missing from JSON.');
        assert(json[r'PINTEREST_PRODUCT_CATEGORIES'] != null, 'Required key "CatalogsBaseFilterKeys[PINTEREST_PRODUCT_CATEGORIES]" has a null value in JSON.');
        return true;
      }());

      return CatalogsBaseFilterKeys(
        MIN_PRICE: CatalogsProductGroupPricingCriteria.fromJson(json[r'MIN_PRICE'])!,
        MAX_PRICE: CatalogsProductGroupPricingCriteria.fromJson(json[r'MAX_PRICE'])!,
        CURRENCY: CatalogsProductGroupCurrencyCriteria.fromJson(json[r'CURRENCY'])!,
        ITEM_ID: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'ITEM_ID'])!,
        AVAILABILITY: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'AVAILABILITY'])!,
        BRAND: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'BRAND'])!,
        CONDITION: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'CONDITION'])!,
        CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_0'])!,
        CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_1'])!,
        CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_2'])!,
        CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_3'])!,
        CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_4'])!,
        ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'ITEM_GROUP_ID'])!,
        GENDER: CatalogsProductGroupMultipleGenderCriteria.fromJson(json[r'GENDER'])!,
        MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria.fromJson(json[r'MEDIA_TYPE'])!,
        PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'PRODUCT_TYPE_4'])!,
        PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'PRODUCT_TYPE_3'])!,
        PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'PRODUCT_TYPE_2'])!,
        PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'PRODUCT_TYPE_1'])!,
        PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'PRODUCT_TYPE_0'])!,
        GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_6'])!,
        GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_5'])!,
        GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_4'])!,
        GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_3'])!,
        GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_2'])!,
        GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_1'])!,
        GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_0'])!,
        CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria.fromJson(json[r'CUSTOM_NUMBER_0'])!,
        CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria.fromJson(json[r'CUSTOM_NUMBER_1'])!,
        CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria.fromJson(json[r'CUSTOM_NUMBER_2'])!,
        CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria.fromJson(json[r'CUSTOM_NUMBER_3'])!,
        CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria.fromJson(json[r'CUSTOM_NUMBER_4'])!,
        TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'TITLE_KEYWORDS'])!,
        PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria.fromJson(json[r'PINTEREST_PRODUCT_CATEGORIES'])!,
      );
    }
    return null;
  }

  static List<CatalogsBaseFilterKeys> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsBaseFilterKeys>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsBaseFilterKeys.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsBaseFilterKeys> mapFromJson(dynamic json) {
    final map = <String, CatalogsBaseFilterKeys>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsBaseFilterKeys.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsBaseFilterKeys-objects as value to a dart map
  static Map<String, List<CatalogsBaseFilterKeys>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsBaseFilterKeys>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsBaseFilterKeys.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'MIN_PRICE',
    'MAX_PRICE',
    'CURRENCY',
    'ITEM_ID',
    'AVAILABILITY',
    'BRAND',
    'CONDITION',
    'CUSTOM_LABEL_0',
    'CUSTOM_LABEL_1',
    'CUSTOM_LABEL_2',
    'CUSTOM_LABEL_3',
    'CUSTOM_LABEL_4',
    'ITEM_GROUP_ID',
    'GENDER',
    'MEDIA_TYPE',
    'PRODUCT_TYPE_4',
    'PRODUCT_TYPE_3',
    'PRODUCT_TYPE_2',
    'PRODUCT_TYPE_1',
    'PRODUCT_TYPE_0',
    'GOOGLE_PRODUCT_CATEGORY_6',
    'GOOGLE_PRODUCT_CATEGORY_5',
    'GOOGLE_PRODUCT_CATEGORY_4',
    'GOOGLE_PRODUCT_CATEGORY_3',
    'GOOGLE_PRODUCT_CATEGORY_2',
    'GOOGLE_PRODUCT_CATEGORY_1',
    'GOOGLE_PRODUCT_CATEGORY_0',
    'CUSTOM_NUMBER_0',
    'CUSTOM_NUMBER_1',
    'CUSTOM_NUMBER_2',
    'CUSTOM_NUMBER_3',
    'CUSTOM_NUMBER_4',
    'TITLE_KEYWORDS',
    'PINTEREST_PRODUCT_CATEGORIES',
  };
}

