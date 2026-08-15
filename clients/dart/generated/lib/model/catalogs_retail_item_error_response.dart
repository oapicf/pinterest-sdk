//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailItemErrorResponse {
  /// Returns a new [CatalogsRetailItemErrorResponse] instance.
  CatalogsRetailItemErrorResponse({
    required this.catalogType,
    this.errors = const [],
    this.itemId,
  });

  CatalogsType catalogType;

  /// Array with the errors for the item id requested
  List<ItemValidationEvent> errors;

  /// The catalog item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailItemErrorResponse &&
    other.catalogType == catalogType &&
    _deepEquality.equals(other.errors, errors) &&
    other.itemId == itemId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (errors.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode);

  @override
  String toString() => 'CatalogsRetailItemErrorResponse[catalogType=$catalogType, errors=$errors, itemId=$itemId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'errors'] = this.errors;
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsRetailItemErrorResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailItemErrorResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsRetailItemErrorResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsRetailItemErrorResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsRetailItemErrorResponse(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
        itemId: mapValueOfType<String>(json, r'item_id'),
      );
    }
    return null;
  }

  static List<CatalogsRetailItemErrorResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemErrorResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemErrorResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailItemErrorResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailItemErrorResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailItemErrorResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailItemErrorResponse-objects as value to a dart map
  static Map<String, List<CatalogsRetailItemErrorResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailItemErrorResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailItemErrorResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'errors',
  };
}

