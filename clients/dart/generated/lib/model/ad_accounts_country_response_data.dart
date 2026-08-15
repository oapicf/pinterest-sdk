//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccountsCountryResponseData {
  /// Returns a new [AdAccountsCountryResponseData] instance.
  AdAccountsCountryResponseData({
    this.code,
    this.currency,
    this.index,
    this.name,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AdCountry? code;

  /// Country currency.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? currency;

  /// Country index
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? index;

  /// Country name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccountsCountryResponseData &&
    other.code == code &&
    other.currency == currency &&
    other.index == index &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code == null ? 0 : code!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (index == null ? 0 : index!.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'AdAccountsCountryResponseData[code=$code, currency=$currency, index=$index, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.index != null) {
      json[r'index'] = this.index;
    } else {
      json[r'index'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [AdAccountsCountryResponseData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccountsCountryResponseData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdAccountsCountryResponseData[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdAccountsCountryResponseData[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdAccountsCountryResponseData(
        code: AdCountry.fromJson(json[r'code']),
        currency: mapValueOfType<String>(json, r'currency'),
        index: num.parse('${json[r'index']}'),
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<AdAccountsCountryResponseData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountsCountryResponseData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountsCountryResponseData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccountsCountryResponseData> mapFromJson(dynamic json) {
    final map = <String, AdAccountsCountryResponseData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccountsCountryResponseData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccountsCountryResponseData-objects as value to a dart map
  static Map<String, List<AdAccountsCountryResponseData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccountsCountryResponseData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccountsCountryResponseData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

