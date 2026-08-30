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
    required this.CUSTOM_LABEL_0,
    required this.CUSTOM_LABEL_1,
    required this.CUSTOM_LABEL_2,
    required this.CUSTOM_LABEL_3,
    required this.CUSTOM_LABEL_4,
    required this.COUNTRY,
    required this.TITLE_KEYWORDS,
  });

  PriceFilterPrice PRICE;

  CatalogsProductGroupMultipleStringCriteria HOTEL_ID;

  CatalogsProductGroupMultipleStringCriteria BRAND;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3;

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4;

  CatalogsProductGroupMultipleCountriesCriteria COUNTRY;

  CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelProductGroupFilterKeys &&
    other.PRICE == PRICE &&
    other.HOTEL_ID == HOTEL_ID &&
    other.BRAND == BRAND &&
    other.CUSTOM_LABEL_0 == CUSTOM_LABEL_0 &&
    other.CUSTOM_LABEL_1 == CUSTOM_LABEL_1 &&
    other.CUSTOM_LABEL_2 == CUSTOM_LABEL_2 &&
    other.CUSTOM_LABEL_3 == CUSTOM_LABEL_3 &&
    other.CUSTOM_LABEL_4 == CUSTOM_LABEL_4 &&
    other.COUNTRY == COUNTRY &&
    other.TITLE_KEYWORDS == TITLE_KEYWORDS;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (PRICE.hashCode) +
    (HOTEL_ID.hashCode) +
    (BRAND.hashCode) +
    (CUSTOM_LABEL_0.hashCode) +
    (CUSTOM_LABEL_1.hashCode) +
    (CUSTOM_LABEL_2.hashCode) +
    (CUSTOM_LABEL_3.hashCode) +
    (CUSTOM_LABEL_4.hashCode) +
    (COUNTRY.hashCode) +
    (TITLE_KEYWORDS.hashCode);

  @override
  String toString() => 'CatalogsHotelProductGroupFilterKeys[PRICE=$PRICE, HOTEL_ID=$HOTEL_ID, BRAND=$BRAND, CUSTOM_LABEL_0=$CUSTOM_LABEL_0, CUSTOM_LABEL_1=$CUSTOM_LABEL_1, CUSTOM_LABEL_2=$CUSTOM_LABEL_2, CUSTOM_LABEL_3=$CUSTOM_LABEL_3, CUSTOM_LABEL_4=$CUSTOM_LABEL_4, COUNTRY=$COUNTRY, TITLE_KEYWORDS=$TITLE_KEYWORDS]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'PRICE'] = this.PRICE;
      json[r'HOTEL_ID'] = this.HOTEL_ID;
      json[r'BRAND'] = this.BRAND;
      json[r'CUSTOM_LABEL_0'] = this.CUSTOM_LABEL_0;
      json[r'CUSTOM_LABEL_1'] = this.CUSTOM_LABEL_1;
      json[r'CUSTOM_LABEL_2'] = this.CUSTOM_LABEL_2;
      json[r'CUSTOM_LABEL_3'] = this.CUSTOM_LABEL_3;
      json[r'CUSTOM_LABEL_4'] = this.CUSTOM_LABEL_4;
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
        assert(json.containsKey(r'PRICE'), 'Required key "CatalogsHotelProductGroupFilterKeys[PRICE]" is missing from JSON.');
        assert(json[r'PRICE'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[PRICE]" has a null value in JSON.');
        assert(json.containsKey(r'HOTEL_ID'), 'Required key "CatalogsHotelProductGroupFilterKeys[HOTEL_ID]" is missing from JSON.');
        assert(json[r'HOTEL_ID'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[HOTEL_ID]" has a null value in JSON.');
        assert(json.containsKey(r'BRAND'), 'Required key "CatalogsHotelProductGroupFilterKeys[BRAND]" is missing from JSON.');
        assert(json[r'BRAND'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[BRAND]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_0'), 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_0]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_0'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_0]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_1'), 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_1]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_1'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_1]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_2'), 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_2]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_2'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_2]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_3'), 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_3]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_3'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_3]" has a null value in JSON.');
        assert(json.containsKey(r'CUSTOM_LABEL_4'), 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_4]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_4'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[CUSTOM_LABEL_4]" has a null value in JSON.');
        assert(json.containsKey(r'COUNTRY'), 'Required key "CatalogsHotelProductGroupFilterKeys[COUNTRY]" is missing from JSON.');
        assert(json[r'COUNTRY'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[COUNTRY]" has a null value in JSON.');
        assert(json.containsKey(r'TITLE_KEYWORDS'), 'Required key "CatalogsHotelProductGroupFilterKeys[TITLE_KEYWORDS]" is missing from JSON.');
        assert(json[r'TITLE_KEYWORDS'] != null, 'Required key "CatalogsHotelProductGroupFilterKeys[TITLE_KEYWORDS]" has a null value in JSON.');
        return true;
      }());

      return CatalogsHotelProductGroupFilterKeys(
        PRICE: PriceFilterPrice.fromJson(json[r'PRICE'])!,
        HOTEL_ID: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'HOTEL_ID'])!,
        BRAND: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'BRAND'])!,
        CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_0'])!,
        CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_1'])!,
        CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_2'])!,
        CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_3'])!,
        CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_4'])!,
        COUNTRY: CatalogsProductGroupMultipleCountriesCriteria.fromJson(json[r'COUNTRY'])!,
        TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'TITLE_KEYWORDS'])!,
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

