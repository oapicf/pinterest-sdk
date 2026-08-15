//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelProductGroupFilterKeys {
  /// Returns a new [CatalogsHotelProductGroupFilterKeys] instance.
  CatalogsHotelProductGroupFilterKeys({
    required this.PRICE,
    required this.HOTEL_ID,
    required this.BRAND,
    required this.cUSTOMLABEL0,
    required this.cUSTOMLABEL1,
    required this.cUSTOMLABEL2,
    required this.cUSTOMLABEL3,
    required this.cUSTOMLABEL4,
    required this.COUNTRY,
    required this.TITLE_KEYWORDS,
  });

  CatalogsProductGroupPricingCurrencyCriteria PRICE;

  CatalogsProductGroupMultipleStringCriteria HOTEL_ID;

  CatalogsProductGroupMultipleStringCriteria BRAND;

  CatalogsProductGroupFilterOperatorTypeCriteria cUSTOMLABEL0;

  CatalogsProductGroupFilterOperatorTypeCriteria cUSTOMLABEL1;

  CatalogsProductGroupFilterOperatorTypeCriteria cUSTOMLABEL2;

  CatalogsProductGroupFilterOperatorTypeCriteria cUSTOMLABEL3;

  CatalogsProductGroupFilterOperatorTypeCriteria cUSTOMLABEL4;

  CatalogsProductGroupMultipleCountriesCriteria COUNTRY;

  CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelProductGroupFilterKeys &&
    other.PRICE == PRICE &&
    other.HOTEL_ID == HOTEL_ID &&
    other.BRAND == BRAND &&
    other.cUSTOMLABEL0 == cUSTOMLABEL0 &&
    other.cUSTOMLABEL1 == cUSTOMLABEL1 &&
    other.cUSTOMLABEL2 == cUSTOMLABEL2 &&
    other.cUSTOMLABEL3 == cUSTOMLABEL3 &&
    other.cUSTOMLABEL4 == cUSTOMLABEL4 &&
    other.COUNTRY == COUNTRY &&
    other.TITLE_KEYWORDS == TITLE_KEYWORDS;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (PRICE.hashCode) +
    (HOTEL_ID.hashCode) +
    (BRAND.hashCode) +
    (cUSTOMLABEL0.hashCode) +
    (cUSTOMLABEL1.hashCode) +
    (cUSTOMLABEL2.hashCode) +
    (cUSTOMLABEL3.hashCode) +
    (cUSTOMLABEL4.hashCode) +
    (COUNTRY.hashCode) +
    (TITLE_KEYWORDS.hashCode);

  @override
  String toString() => 'CatalogsHotelProductGroupFilterKeys[PRICE=$PRICE, HOTEL_ID=$HOTEL_ID, BRAND=$BRAND, cUSTOMLABEL0=$cUSTOMLABEL0, cUSTOMLABEL1=$cUSTOMLABEL1, cUSTOMLABEL2=$cUSTOMLABEL2, cUSTOMLABEL3=$cUSTOMLABEL3, cUSTOMLABEL4=$cUSTOMLABEL4, COUNTRY=$COUNTRY, TITLE_KEYWORDS=$TITLE_KEYWORDS]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'PRICE'] = this.PRICE;
      json[r'HOTEL_ID'] = this.HOTEL_ID;
      json[r'BRAND'] = this.BRAND;
      json[r'CUSTOM_LABEL_0'] = this.cUSTOMLABEL0;
      json[r'CUSTOM_LABEL_1'] = this.cUSTOMLABEL1;
      json[r'CUSTOM_LABEL_2'] = this.cUSTOMLABEL2;
      json[r'CUSTOM_LABEL_3'] = this.cUSTOMLABEL3;
      json[r'CUSTOM_LABEL_4'] = this.cUSTOMLABEL4;
      json[r'COUNTRY'] = this.COUNTRY;
      json[r'TITLE_KEYWORDS'] = this.TITLE_KEYWORDS;
    return json;
  }

  /// Returns a new [CatalogsHotelProductGroupFilterKeys] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelProductGroupFilterKeys? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelProductGroupFilterKeys[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelProductGroupFilterKeys(
        PRICE: CatalogsProductGroupPricingCurrencyCriteria.fromJson(json[r'PRICE'])!,
        HOTEL_ID: mapValueOfType<CatalogsProductGroupMultipleStringCriteria>(json, r'HOTEL_ID')!,
        BRAND: mapValueOfType<CatalogsProductGroupMultipleStringCriteria>(json, r'BRAND')!,
        cUSTOMLABEL0: mapValueOfType<CatalogsProductGroupFilterOperatorTypeCriteria>(json, r'CUSTOM_LABEL_0')!,
        cUSTOMLABEL1: mapValueOfType<CatalogsProductGroupFilterOperatorTypeCriteria>(json, r'CUSTOM_LABEL_1')!,
        cUSTOMLABEL2: mapValueOfType<CatalogsProductGroupFilterOperatorTypeCriteria>(json, r'CUSTOM_LABEL_2')!,
        cUSTOMLABEL3: mapValueOfType<CatalogsProductGroupFilterOperatorTypeCriteria>(json, r'CUSTOM_LABEL_3')!,
        cUSTOMLABEL4: mapValueOfType<CatalogsProductGroupFilterOperatorTypeCriteria>(json, r'CUSTOM_LABEL_4')!,
        COUNTRY: mapValueOfType<CatalogsProductGroupMultipleCountriesCriteria>(json, r'COUNTRY')!,
        TITLE_KEYWORDS: mapValueOfType<CatalogsProductGroupMultipleStringCriteria>(json, r'TITLE_KEYWORDS')!,
      );
    }
    return null;
  }

  static List<CatalogsHotelProductGroupFilterKeys> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupFilterKeys>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupFilterKeys.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelProductGroupFilterKeys> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelProductGroupFilterKeys>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelProductGroupFilterKeys.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelProductGroupFilterKeys-objects as value to a dart map
  static Map<String, List<CatalogsHotelProductGroupFilterKeys>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelProductGroupFilterKeys>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelProductGroupFilterKeys.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'PRICE',
    'HOTEL_ID',
    'BRAND',
    'CUSTOM_LABEL_0',
    'CUSTOM_LABEL_1',
    'CUSTOM_LABEL_2',
    'CUSTOM_LABEL_3',
    'CUSTOM_LABEL_4',
    'COUNTRY',
    'TITLE_KEYWORDS',
  };
}

