//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalInventoryItemsBatch {
  /// Returns a new [LocalInventoryItemsBatch] instance.
  LocalInventoryItemsBatch({
    required this.batchId,
    this.completedTime,
    required this.createdTime,
    this.operationResults = const [],
    required this.status,
  });

  /// Id of the batch operation
  String batchId;

  /// Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? completedTime;

  /// Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  DateTime createdTime;

  /// Array of operation results
  List<SupplementalOperationResult> operationResults;

  /// Status of the batch: PROCESSING, COMPLETED, FAILED
  SupplementalItemBatchOperationStatus status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalInventoryItemsBatch &&
    other.batchId == batchId &&
    other.completedTime == completedTime &&
    other.createdTime == createdTime &&
    _deepEquality.equals(other.operationResults, operationResults) &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (batchId.hashCode) +
    (completedTime == null ? 0 : completedTime!.hashCode) +
    (createdTime.hashCode) +
    (operationResults.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'LocalInventoryItemsBatch[batchId=$batchId, completedTime=$completedTime, createdTime=$createdTime, operationResults=$operationResults, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'batch_id'] = this.batchId;
    if (this.completedTime != null) {
      json[r'completed_time'] = this.completedTime!.toUtc().toIso8601String();
    } else {
      json[r'completed_time'] = null;
    }
      json[r'created_time'] = this.createdTime.toUtc().toIso8601String();
      json[r'operation_results'] = this.operationResults;
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [LocalInventoryItemsBatch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalInventoryItemsBatch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'batch_id'), 'Required key "LocalInventoryItemsBatch[batch_id]" is missing from JSON.');
        assert(json[r'batch_id'] != null, 'Required key "LocalInventoryItemsBatch[batch_id]" has a null value in JSON.');
        assert(json.containsKey(r'created_time'), 'Required key "LocalInventoryItemsBatch[created_time]" is missing from JSON.');
        assert(json[r'created_time'] != null, 'Required key "LocalInventoryItemsBatch[created_time]" has a null value in JSON.');
        assert(json.containsKey(r'operation_results'), 'Required key "LocalInventoryItemsBatch[operation_results]" is missing from JSON.');
        assert(json[r'operation_results'] != null, 'Required key "LocalInventoryItemsBatch[operation_results]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "LocalInventoryItemsBatch[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "LocalInventoryItemsBatch[status]" has a null value in JSON.');
        return true;
      }());

      return LocalInventoryItemsBatch(
        batchId: mapValueOfType<String>(json, r'batch_id')!,
        completedTime: mapDateTime(json, r'completed_time', r''),
        createdTime: mapDateTime(json, r'created_time', r'')!,
        operationResults: SupplementalOperationResult.listFromJson(json[r'operation_results']),
        status: SupplementalItemBatchOperationStatus.fromJson(json[r'status'])!,
      );
    }
    return null;
  }

  static List<LocalInventoryItemsBatch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryItemsBatch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryItemsBatch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalInventoryItemsBatch> mapFromJson(dynamic json) {
    final map = <String, LocalInventoryItemsBatch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalInventoryItemsBatch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalInventoryItemsBatch-objects as value to a dart map
  static Map<String, List<LocalInventoryItemsBatch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalInventoryItemsBatch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalInventoryItemsBatch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'batch_id',
    'created_time',
    'operation_results',
    'status',
  };
}

