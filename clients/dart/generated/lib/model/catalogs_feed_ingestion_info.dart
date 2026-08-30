//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedIngestionInfo {
  /// Returns a new [CatalogsFeedIngestionInfo] instance.
  CatalogsFeedIngestionInfo({
    this.IN_STOCK,
    this.OUT_OF_STOCK,
    this.PREORDER,
  });

  /// The number of ingested products that are in stock.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IN_STOCK;

  /// The number of ingested products that are in out of stock.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? OUT_OF_STOCK;

  /// The number of ingested products that are in preorder.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? PREORDER;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedIngestionInfo &&
    other.IN_STOCK == IN_STOCK &&
    other.OUT_OF_STOCK == OUT_OF_STOCK &&
    other.PREORDER == PREORDER;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (IN_STOCK == null ? 0 : IN_STOCK!.hashCode) +
    (OUT_OF_STOCK == null ? 0 : OUT_OF_STOCK!.hashCode) +
    (PREORDER == null ? 0 : PREORDER!.hashCode);

  @override
  String toString() => 'CatalogsFeedIngestionInfo[IN_STOCK=$IN_STOCK, OUT_OF_STOCK=$OUT_OF_STOCK, PREORDER=$PREORDER]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.IN_STOCK != null) {
      json[r'IN_STOCK'] = this.IN_STOCK;
    } else {
      json[r'IN_STOCK'] = null;
    }
    if (this.OUT_OF_STOCK != null) {
      json[r'OUT_OF_STOCK'] = this.OUT_OF_STOCK;
    } else {
      json[r'OUT_OF_STOCK'] = null;
    }
    if (this.PREORDER != null) {
      json[r'PREORDER'] = this.PREORDER;
    } else {
      json[r'PREORDER'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsFeedIngestionInfo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedIngestionInfo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CatalogsFeedIngestionInfo(
        IN_STOCK: mapValueOfType<int>(json, r'IN_STOCK'),
        OUT_OF_STOCK: mapValueOfType<int>(json, r'OUT_OF_STOCK'),
        PREORDER: mapValueOfType<int>(json, r'PREORDER'),
      );
    }
    return null;
  }

  static List<CatalogsFeedIngestionInfo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedIngestionInfo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedIngestionInfo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedIngestionInfo> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedIngestionInfo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedIngestionInfo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedIngestionInfo-objects as value to a dart map
  static Map<String, List<CatalogsFeedIngestionInfo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedIngestionInfo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedIngestionInfo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

