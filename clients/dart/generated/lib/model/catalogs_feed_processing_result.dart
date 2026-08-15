//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedProcessingResult {
  /// Returns a new [CatalogsFeedProcessingResult] instance.
  CatalogsFeedProcessingResult({
    required this.createdAt,
    required this.id,
    required this.updatedAt,
    required this.ingestionDetails,
    required this.productCounts,
    required this.status,
    required this.validationDetails,
    this.videoCounts,
  });

  DateTime createdAt;

  String id;

  DateTime updatedAt;

  CatalogsFeedIngestionDetails ingestionDetails;

  CatalogsFeedProductCounts? productCounts;

  CatalogsFeedProcessingStatus status;

  CatalogsFeedValidationDetails validationDetails;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsFeedVideoCounts? videoCounts;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedProcessingResult &&
    other.createdAt == createdAt &&
    other.id == id &&
    other.updatedAt == updatedAt &&
    other.ingestionDetails == ingestionDetails &&
    other.productCounts == productCounts &&
    other.status == status &&
    other.validationDetails == validationDetails &&
    other.videoCounts == videoCounts;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (createdAt.hashCode) +
    (id.hashCode) +
    (updatedAt.hashCode) +
    (ingestionDetails.hashCode) +
    (productCounts == null ? 0 : productCounts!.hashCode) +
    (status.hashCode) +
    (validationDetails.hashCode) +
    (videoCounts == null ? 0 : videoCounts!.hashCode);

  @override
  String toString() => 'CatalogsFeedProcessingResult[createdAt=$createdAt, id=$id, updatedAt=$updatedAt, ingestionDetails=$ingestionDetails, productCounts=$productCounts, status=$status, validationDetails=$validationDetails, videoCounts=$videoCounts]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'created_at'] = this.createdAt.toUtc().toIso8601String();
      json[r'id'] = this.id;
      json[r'updated_at'] = this.updatedAt.toUtc().toIso8601String();
      json[r'ingestion_details'] = this.ingestionDetails;
    if (this.productCounts != null) {
      json[r'product_counts'] = this.productCounts;
    } else {
      json[r'product_counts'] = null;
    }
      json[r'status'] = this.status;
      json[r'validation_details'] = this.validationDetails;
    if (this.videoCounts != null) {
      json[r'video_counts'] = this.videoCounts;
    } else {
      json[r'video_counts'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsFeedProcessingResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedProcessingResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsFeedProcessingResult[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsFeedProcessingResult[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsFeedProcessingResult(
        createdAt: mapDateTime(json, r'created_at', r'')!,
        id: mapValueOfType<String>(json, r'id')!,
        updatedAt: mapDateTime(json, r'updated_at', r'')!,
        ingestionDetails: CatalogsFeedIngestionDetails.fromJson(json[r'ingestion_details'])!,
        productCounts: CatalogsFeedProductCounts.fromJson(json[r'product_counts']),
        status: CatalogsFeedProcessingStatus.fromJson(json[r'status'])!,
        validationDetails: CatalogsFeedValidationDetails.fromJson(json[r'validation_details'])!,
        videoCounts: CatalogsFeedVideoCounts.fromJson(json[r'video_counts']),
      );
    }
    return null;
  }

  static List<CatalogsFeedProcessingResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedProcessingResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedProcessingResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedProcessingResult> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedProcessingResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedProcessingResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedProcessingResult-objects as value to a dart map
  static Map<String, List<CatalogsFeedProcessingResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedProcessingResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedProcessingResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'created_at',
    'id',
    'updated_at',
    'ingestion_details',
    'product_counts',
    'status',
    'validation_details',
  };
}

