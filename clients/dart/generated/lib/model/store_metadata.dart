//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class StoreMetadata {
  /// Returns a new [StoreMetadata] instance.
  StoreMetadata({
    this.geohash,
    this.latitude,
    this.longitude,
    required this.storeCode,
    required this.storeId,
    this.storeName,
  });

  /// Geohash of the store location
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? geohash;

  /// Geographic latitude coordinate of the store
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? latitude;

  /// Geographic longitude coordinate of the store
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? longitude;

  /// Merchant provided store code
  String storeCode;

  /// Internal store code
  String storeId;

  /// Store name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? storeName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is StoreMetadata &&
    other.geohash == geohash &&
    other.latitude == latitude &&
    other.longitude == longitude &&
    other.storeCode == storeCode &&
    other.storeId == storeId &&
    other.storeName == storeName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (geohash == null ? 0 : geohash!.hashCode) +
    (latitude == null ? 0 : latitude!.hashCode) +
    (longitude == null ? 0 : longitude!.hashCode) +
    (storeCode.hashCode) +
    (storeId.hashCode) +
    (storeName == null ? 0 : storeName!.hashCode);

  @override
  String toString() => 'StoreMetadata[geohash=$geohash, latitude=$latitude, longitude=$longitude, storeCode=$storeCode, storeId=$storeId, storeName=$storeName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.geohash != null) {
      json[r'geohash'] = this.geohash;
    } else {
      json[r'geohash'] = null;
    }
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
      json[r'store_code'] = this.storeCode;
      json[r'store_id'] = this.storeId;
    if (this.storeName != null) {
      json[r'store_name'] = this.storeName;
    } else {
      json[r'store_name'] = null;
    }
    return json;
  }

  /// Returns a new [StoreMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static StoreMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'store_code'), 'Required key "StoreMetadata[store_code]" is missing from JSON.');
        assert(json[r'store_code'] != null, 'Required key "StoreMetadata[store_code]" has a null value in JSON.');
        assert(json.containsKey(r'store_id'), 'Required key "StoreMetadata[store_id]" is missing from JSON.');
        assert(json[r'store_id'] != null, 'Required key "StoreMetadata[store_id]" has a null value in JSON.');
        return true;
      }());

      return StoreMetadata(
        geohash: mapValueOfType<String>(json, r'geohash'),
        latitude: mapValueOfType<double>(json, r'latitude'),
        longitude: mapValueOfType<double>(json, r'longitude'),
        storeCode: mapValueOfType<String>(json, r'store_code')!,
        storeId: mapValueOfType<String>(json, r'store_id')!,
        storeName: mapValueOfType<String>(json, r'store_name'),
      );
    }
    return null;
  }

  static List<StoreMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StoreMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StoreMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, StoreMetadata> mapFromJson(dynamic json) {
    final map = <String, StoreMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = StoreMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of StoreMetadata-objects as value to a dart map
  static Map<String, List<StoreMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<StoreMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = StoreMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'store_code',
    'store_id',
  };
}

