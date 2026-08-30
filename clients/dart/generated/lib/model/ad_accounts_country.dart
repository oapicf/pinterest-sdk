//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccountsCountry {
  /// Returns a new [AdAccountsCountry] instance.
  AdAccountsCountry({
    required this.code,
    required this.currency,
    required this.index,
    required this.name,
  });

  Country code;

  /// Country currency.
  String currency;

  /// Country index
  num index;

  /// Country name
  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccountsCountry &&
    other.code == code &&
    other.currency == currency &&
    other.index == index &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code.hashCode) +
    (currency.hashCode) +
    (index.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'AdAccountsCountry[code=$code, currency=$currency, index=$index, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'code'] = this.code;
      json[r'currency'] = this.currency;
      json[r'index'] = this.index;
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [AdAccountsCountry] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccountsCountry? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'code'), 'Required key "AdAccountsCountry[code]" is missing from JSON.');
        assert(json[r'code'] != null, 'Required key "AdAccountsCountry[code]" has a null value in JSON.');
        assert(json.containsKey(r'currency'), 'Required key "AdAccountsCountry[currency]" is missing from JSON.');
        assert(json[r'currency'] != null, 'Required key "AdAccountsCountry[currency]" has a null value in JSON.');
        assert(json.containsKey(r'index'), 'Required key "AdAccountsCountry[index]" is missing from JSON.');
        assert(json[r'index'] != null, 'Required key "AdAccountsCountry[index]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "AdAccountsCountry[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "AdAccountsCountry[name]" has a null value in JSON.');
        return true;
      }());

      return AdAccountsCountry(
        code: Country.fromJson(json[r'code'])!,
        currency: mapValueOfType<String>(json, r'currency')!,
        index: num.parse('${json[r'index']}'),
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<AdAccountsCountry> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountsCountry>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountsCountry.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccountsCountry> mapFromJson(dynamic json) {
    final map = <String, AdAccountsCountry>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccountsCountry.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccountsCountry-objects as value to a dart map
  static Map<String, List<AdAccountsCountry>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccountsCountry>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccountsCountry.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'code',
    'currency',
    'index',
    'name',
  };
}

