//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionDeletionRequest {
  /// Returns a new [ConversionDeletionRequest] instance.
  ConversionDeletionRequest({
    required this.createdTime,
    this.processedTime,
    required this.requestId,
    required this.status,
  });

  /// Timestamp when the conversion deletion request was succesfully created.
  DateTime createdTime;

  /// Timestamp when the conversion deletion request was processed.
  DateTime? processedTime;

  /// Unique identifier of the conversion deletion request
  String requestId;

  /// Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
  ConversionDeletionRequestStatus status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionDeletionRequest &&
    other.createdTime == createdTime &&
    other.processedTime == processedTime &&
    other.requestId == requestId &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (createdTime.hashCode) +
    (processedTime == null ? 0 : processedTime!.hashCode) +
    (requestId.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'ConversionDeletionRequest[createdTime=$createdTime, processedTime=$processedTime, requestId=$requestId, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'created_time'] = _dateFormatter.format(this.createdTime.toUtc());
    if (this.processedTime != null) {
      json[r'processed_time'] = _dateFormatter.format(this.processedTime!.toUtc());
    } else {
      json[r'processed_time'] = null;
    }
      json[r'request_id'] = this.requestId;
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [ConversionDeletionRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionDeletionRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'created_time'), 'Required key "ConversionDeletionRequest[created_time]" is missing from JSON.');
        assert(json[r'created_time'] != null, 'Required key "ConversionDeletionRequest[created_time]" has a null value in JSON.');
        assert(json.containsKey(r'request_id'), 'Required key "ConversionDeletionRequest[request_id]" is missing from JSON.');
        assert(json[r'request_id'] != null, 'Required key "ConversionDeletionRequest[request_id]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "ConversionDeletionRequest[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "ConversionDeletionRequest[status]" has a null value in JSON.');
        return true;
      }());

      return ConversionDeletionRequest(
        createdTime: mapDateTime(json, r'created_time', r'')!,
        processedTime: mapDateTime(json, r'processed_time', r''),
        requestId: mapValueOfType<String>(json, r'request_id')!,
        status: ConversionDeletionRequestStatus.fromJson(json[r'status'])!,
      );
    }
    return null;
  }

  static List<ConversionDeletionRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionDeletionRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionDeletionRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionDeletionRequest> mapFromJson(dynamic json) {
    final map = <String, ConversionDeletionRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionDeletionRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionDeletionRequest-objects as value to a dart map
  static Map<String, List<ConversionDeletionRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionDeletionRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionDeletionRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'created_time',
    'request_id',
    'status',
  };
}

