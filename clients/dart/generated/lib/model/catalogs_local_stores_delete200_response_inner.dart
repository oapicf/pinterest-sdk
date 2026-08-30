//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsLocalStoresDelete200ResponseInner {
  /// Returns a new [CatalogsLocalStoresDelete200ResponseInner] instance.
  CatalogsLocalStoresDelete200ResponseInner({
    required this.id,
    required this.status,
  });

  /// The ID of the local store.
  String id;

  CampaignAdPreviewDelete200ResponseInnerStatus status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsLocalStoresDelete200ResponseInner &&
    other.id == id &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'CatalogsLocalStoresDelete200ResponseInner[id=$id, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [CatalogsLocalStoresDelete200ResponseInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsLocalStoresDelete200ResponseInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "CatalogsLocalStoresDelete200ResponseInner[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "CatalogsLocalStoresDelete200ResponseInner[id]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "CatalogsLocalStoresDelete200ResponseInner[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "CatalogsLocalStoresDelete200ResponseInner[status]" has a null value in JSON.');
        return true;
      }());

      return CatalogsLocalStoresDelete200ResponseInner(
        id: mapValueOfType<String>(json, r'id')!,
        status: CampaignAdPreviewDelete200ResponseInnerStatus.fromJson(json[r'status'])!,
      );
    }
    return null;
  }

  static List<CatalogsLocalStoresDelete200ResponseInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsLocalStoresDelete200ResponseInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsLocalStoresDelete200ResponseInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsLocalStoresDelete200ResponseInner> mapFromJson(dynamic json) {
    final map = <String, CatalogsLocalStoresDelete200ResponseInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsLocalStoresDelete200ResponseInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsLocalStoresDelete200ResponseInner-objects as value to a dart map
  static Map<String, List<CatalogsLocalStoresDelete200ResponseInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsLocalStoresDelete200ResponseInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsLocalStoresDelete200ResponseInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'status',
  };
}

