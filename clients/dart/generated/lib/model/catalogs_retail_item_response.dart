//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailItemResponse {
  /// Returns a new [CatalogsRetailItemResponse] instance.
  CatalogsRetailItemResponse({
    this.attributes,
    required this.catalogType,
    this.itemId,
    this.pins = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ItemAttributes? attributes;

  CatalogsType catalogType;

  /// The catalog retail item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  /// The pins mapped to the item
  List<Pin>? pins;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailItemResponse &&
    other.attributes == attributes &&
    other.catalogType == catalogType &&
    other.itemId == itemId &&
    _deepEquality.equals(other.pins, pins);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes == null ? 0 : attributes!.hashCode) +
    (catalogType.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (pins == null ? 0 : pins!.hashCode);

  @override
  String toString() => 'CatalogsRetailItemResponse[attributes=$attributes, catalogType=$catalogType, itemId=$itemId, pins=$pins]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributes != null) {
      json[r'attributes'] = this.attributes;
    } else {
      json[r'attributes'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
    if (this.pins != null) {
      json[r'pins'] = this.pins;
    } else {
      json[r'pins'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsRetailItemResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailItemResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsRetailItemResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsRetailItemResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsRetailItemResponse(
        attributes: ItemAttributes.fromJson(json[r'attributes']),
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        itemId: mapValueOfType<String>(json, r'item_id'),
        pins: Pin.listFromJson(json[r'pins']),
      );
    }
    return null;
  }

  static List<CatalogsRetailItemResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailItemResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailItemResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailItemResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailItemResponse-objects as value to a dart map
  static Map<String, List<CatalogsRetailItemResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailItemResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailItemResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
  };
}

