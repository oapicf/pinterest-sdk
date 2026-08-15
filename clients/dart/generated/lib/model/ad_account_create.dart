//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccountCreate {
  /// Returns a new [AdAccountCreate] instance.
  AdAccountCreate({
    this.country,
    this.currency,
    this.name,
    this.ownerUserId,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Country? country;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Currency? currency;

  /// Ad account name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Advertiser's owning user ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? ownerUserId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccountCreate &&
    other.country == country &&
    other.currency == currency &&
    other.name == name &&
    other.ownerUserId == ownerUserId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country == null ? 0 : country!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (ownerUserId == null ? 0 : ownerUserId!.hashCode);

  @override
  String toString() => 'AdAccountCreate[country=$country, currency=$currency, name=$name, ownerUserId=$ownerUserId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.ownerUserId != null) {
      json[r'owner_user_id'] = this.ownerUserId;
    } else {
      json[r'owner_user_id'] = null;
    }
    return json;
  }

  /// Returns a new [AdAccountCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccountCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdAccountCreate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdAccountCreate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdAccountCreate(
        country: Country.fromJson(json[r'country']),
        currency: Currency.fromJson(json[r'currency']),
        name: mapValueOfType<String>(json, r'name'),
        ownerUserId: mapValueOfType<String>(json, r'owner_user_id'),
      );
    }
    return null;
  }

  static List<AdAccountCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccountCreate> mapFromJson(dynamic json) {
    final map = <String, AdAccountCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccountCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccountCreate-objects as value to a dart map
  static Map<String, List<AdAccountCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccountCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccountCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

