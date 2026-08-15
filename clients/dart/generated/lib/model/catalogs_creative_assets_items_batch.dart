//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsItemsBatch {
  /// Returns a new [CatalogsCreativeAssetsItemsBatch] instance.
  CatalogsCreativeAssetsItemsBatch({
    this.batchId,
    required this.catalogType,
    this.completedTime,
    this.createdTime,
    this.items = const [],
    this.status,
  });

  /// Id of the catalogs items batch
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? batchId;

  CatalogsType catalogType;

  /// Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  DateTime? completedTime;

  /// Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? createdTime;

  /// Array with the catalogs items processing records part of the catalogs items batch
  List<CreativeAssetsProcessingRecord> items;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BatchOperationStatus? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsItemsBatch &&
    other.batchId == batchId &&
    other.catalogType == catalogType &&
    other.completedTime == completedTime &&
    other.createdTime == createdTime &&
    _deepEquality.equals(other.items, items) &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (batchId == null ? 0 : batchId!.hashCode) +
    (catalogType.hashCode) +
    (completedTime == null ? 0 : completedTime!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (items.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsItemsBatch[batchId=$batchId, catalogType=$catalogType, completedTime=$completedTime, createdTime=$createdTime, items=$items, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.batchId != null) {
      json[r'batch_id'] = this.batchId;
    } else {
      json[r'batch_id'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
    if (this.completedTime != null) {
      json[r'completed_time'] = this.completedTime!.toUtc().toIso8601String();
    } else {
      json[r'completed_time'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime!.toUtc().toIso8601String();
    } else {
      json[r'created_time'] = null;
    }
      json[r'items'] = this.items;
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsItemsBatch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsItemsBatch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsItemsBatch[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsItemsBatch[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsItemsBatch(
        batchId: mapValueOfType<String>(json, r'batch_id'),
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        completedTime: mapDateTime(json, r'completed_time', r''),
        createdTime: mapDateTime(json, r'created_time', r''),
        items: CreativeAssetsProcessingRecord.listFromJson(json[r'items']),
        status: BatchOperationStatus.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsItemsBatch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemsBatch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemsBatch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsItemsBatch> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsItemsBatch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsItemsBatch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsItemsBatch-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsItemsBatch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsItemsBatch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsItemsBatch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
  };
}

