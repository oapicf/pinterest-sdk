//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalStoreBatchUpdate {
  /// Returns a new [LocalStoreBatchUpdate] instance.
  LocalStoreBatchUpdate({
    this.addressPrimary,
    this.addressSecondary,
    this.city,
    this.country,
    required this.id,
    this.latitude,
    this.longitude,
    this.name,
    this.postalCode,
    this.region,
    this.storeCode,
  });

  /// Primary address line of the store.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? addressPrimary;

  /// Secondary address line of the store.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? addressSecondary;

  /// City where the store is located.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? city;

  /// Country code where the store is located.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Country? country;

  /// The ID of the local store.
  String id;

  /// Geographic latitude coordinate of the store.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? latitude;

  /// Geographic longitude coordinate of the store.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? longitude;

  /// The name of the local store.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Postal or ZIP code of the store.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? postalCode;

  /// State or region code where the store is located.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? region;

  /// Merchant provided code for the local store. Unique within the merchant's catalog.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? storeCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalStoreBatchUpdate &&
    other.addressPrimary == addressPrimary &&
    other.addressSecondary == addressSecondary &&
    other.city == city &&
    other.country == country &&
    other.id == id &&
    other.latitude == latitude &&
    other.longitude == longitude &&
    other.name == name &&
    other.postalCode == postalCode &&
    other.region == region &&
    other.storeCode == storeCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (addressPrimary == null ? 0 : addressPrimary!.hashCode) +
    (addressSecondary == null ? 0 : addressSecondary!.hashCode) +
    (city == null ? 0 : city!.hashCode) +
    (country == null ? 0 : country!.hashCode) +
    (id.hashCode) +
    (latitude == null ? 0 : latitude!.hashCode) +
    (longitude == null ? 0 : longitude!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (postalCode == null ? 0 : postalCode!.hashCode) +
    (region == null ? 0 : region!.hashCode) +
    (storeCode == null ? 0 : storeCode!.hashCode);

  @override
  String toString() => 'LocalStoreBatchUpdate[addressPrimary=$addressPrimary, addressSecondary=$addressSecondary, city=$city, country=$country, id=$id, latitude=$latitude, longitude=$longitude, name=$name, postalCode=$postalCode, region=$region, storeCode=$storeCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.addressPrimary != null) {
      json[r'address_primary'] = this.addressPrimary;
    } else {
      json[r'address_primary'] = null;
    }
    if (this.addressSecondary != null) {
      json[r'address_secondary'] = this.addressSecondary;
    } else {
      json[r'address_secondary'] = null;
    }
    if (this.city != null) {
      json[r'city'] = this.city;
    } else {
      json[r'city'] = null;
    }
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
      json[r'id'] = this.id;
    if (this.latitude != null) {
      json[r'latitude'] = this.latitude;
    } else {
      json[r'latitude'] = null;
    }
    if (this.longitude != null) {
      json[r'longitude'] = this.longitude;
    } else {
      json[r'longitude'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.postalCode != null) {
      json[r'postal_code'] = this.postalCode;
    } else {
      json[r'postal_code'] = null;
    }
    if (this.region != null) {
      json[r'region'] = this.region;
    } else {
      json[r'region'] = null;
    }
    if (this.storeCode != null) {
      json[r'store_code'] = this.storeCode;
    } else {
      json[r'store_code'] = null;
    }
    return json;
  }

  /// Returns a new [LocalStoreBatchUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalStoreBatchUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "LocalStoreBatchUpdate[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "LocalStoreBatchUpdate[id]" has a null value in JSON.');
        return true;
      }());

      return LocalStoreBatchUpdate(
        addressPrimary: mapValueOfType<String>(json, r'address_primary'),
        addressSecondary: mapValueOfType<String>(json, r'address_secondary'),
        city: mapValueOfType<String>(json, r'city'),
        country: Country.fromJson(json[r'country']),
        id: mapValueOfType<String>(json, r'id')!,
        latitude: mapValueOfType<double>(json, r'latitude'),
        longitude: mapValueOfType<double>(json, r'longitude'),
        name: mapValueOfType<String>(json, r'name'),
        postalCode: mapValueOfType<String>(json, r'postal_code'),
        region: mapValueOfType<String>(json, r'region'),
        storeCode: mapValueOfType<String>(json, r'store_code'),
      );
    }
    return null;
  }

  static List<LocalStoreBatchUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalStoreBatchUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalStoreBatchUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalStoreBatchUpdate> mapFromJson(dynamic json) {
    final map = <String, LocalStoreBatchUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalStoreBatchUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalStoreBatchUpdate-objects as value to a dart map
  static Map<String, List<LocalStoreBatchUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalStoreBatchUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalStoreBatchUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

