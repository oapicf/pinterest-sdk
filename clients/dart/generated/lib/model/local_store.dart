//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalStore {
  /// Returns a new [LocalStore] instance.
  LocalStore({
    this.addressPrimary,
    this.addressSecondary,
    this.city,
    required this.country,
    required this.createdAt,
    required this.id,
    this.latitude,
    this.longitude,
    required this.name,
    this.postalCode,
    this.region,
    required this.storeCode,
    required this.updatedAt,
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
  Country country;

  /// Creation timestamp
  DateTime createdAt;

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
  String name;

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
  String storeCode;

  /// Last update timestamp
  DateTime updatedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalStore &&
    other.addressPrimary == addressPrimary &&
    other.addressSecondary == addressSecondary &&
    other.city == city &&
    other.country == country &&
    other.createdAt == createdAt &&
    other.id == id &&
    other.latitude == latitude &&
    other.longitude == longitude &&
    other.name == name &&
    other.postalCode == postalCode &&
    other.region == region &&
    other.storeCode == storeCode &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (addressPrimary == null ? 0 : addressPrimary!.hashCode) +
    (addressSecondary == null ? 0 : addressSecondary!.hashCode) +
    (city == null ? 0 : city!.hashCode) +
    (country.hashCode) +
    (createdAt.hashCode) +
    (id.hashCode) +
    (latitude == null ? 0 : latitude!.hashCode) +
    (longitude == null ? 0 : longitude!.hashCode) +
    (name.hashCode) +
    (postalCode == null ? 0 : postalCode!.hashCode) +
    (region == null ? 0 : region!.hashCode) +
    (storeCode.hashCode) +
    (updatedAt.hashCode);

  @override
  String toString() => 'LocalStore[addressPrimary=$addressPrimary, addressSecondary=$addressSecondary, city=$city, country=$country, createdAt=$createdAt, id=$id, latitude=$latitude, longitude=$longitude, name=$name, postalCode=$postalCode, region=$region, storeCode=$storeCode, updatedAt=$updatedAt]';

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
      json[r'country'] = this.country;
      json[r'created_at'] = this.createdAt.toUtc().toIso8601String();
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
      json[r'name'] = this.name;
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
      json[r'store_code'] = this.storeCode;
      json[r'updated_at'] = this.updatedAt.toUtc().toIso8601String();
    return json;
  }

  /// Returns a new [LocalStore] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalStore? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'country'), 'Required key "LocalStore[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "LocalStore[country]" has a null value in JSON.');
        assert(json.containsKey(r'created_at'), 'Required key "LocalStore[created_at]" is missing from JSON.');
        assert(json[r'created_at'] != null, 'Required key "LocalStore[created_at]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "LocalStore[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "LocalStore[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "LocalStore[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "LocalStore[name]" has a null value in JSON.');
        assert(json.containsKey(r'store_code'), 'Required key "LocalStore[store_code]" is missing from JSON.');
        assert(json[r'store_code'] != null, 'Required key "LocalStore[store_code]" has a null value in JSON.');
        assert(json.containsKey(r'updated_at'), 'Required key "LocalStore[updated_at]" is missing from JSON.');
        assert(json[r'updated_at'] != null, 'Required key "LocalStore[updated_at]" has a null value in JSON.');
        return true;
      }());

      return LocalStore(
        addressPrimary: mapValueOfType<String>(json, r'address_primary'),
        addressSecondary: mapValueOfType<String>(json, r'address_secondary'),
        city: mapValueOfType<String>(json, r'city'),
        country: Country.fromJson(json[r'country'])!,
        createdAt: mapDateTime(json, r'created_at', r'')!,
        id: mapValueOfType<String>(json, r'id')!,
        latitude: mapValueOfType<double>(json, r'latitude'),
        longitude: mapValueOfType<double>(json, r'longitude'),
        name: mapValueOfType<String>(json, r'name')!,
        postalCode: mapValueOfType<String>(json, r'postal_code'),
        region: mapValueOfType<String>(json, r'region'),
        storeCode: mapValueOfType<String>(json, r'store_code')!,
        updatedAt: mapDateTime(json, r'updated_at', r'')!,
      );
    }
    return null;
  }

  static List<LocalStore> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalStore>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalStore.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalStore> mapFromJson(dynamic json) {
    final map = <String, LocalStore>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalStore.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalStore-objects as value to a dart map
  static Map<String, List<LocalStore>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalStore>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalStore.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'country',
    'created_at',
    'id',
    'name',
    'store_code',
    'updated_at',
  };
}

