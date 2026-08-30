//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LabelsResponse {
  /// Returns a new [LabelsResponse] instance.
  LabelsResponse({
    this.errors = const [],
    this.labels = const [],
  });

  /// Labels that were not successfully applied.
  List<LabelError> errors;

  List<Label> labels;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LabelsResponse &&
    _deepEquality.equals(other.errors, errors) &&
    _deepEquality.equals(other.labels, labels);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errors.hashCode) +
    (labels.hashCode);

  @override
  String toString() => 'LabelsResponse[errors=$errors, labels=$labels]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'errors'] = this.errors;
      json[r'labels'] = this.labels;
    return json;
  }

  /// Returns a new [LabelsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LabelsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return LabelsResponse(
        errors: LabelError.listFromJson(json[r'errors']),
        labels: Label.listFromJson(json[r'labels']),
      );
    }
    return null;
  }

  static List<LabelsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LabelsResponse> mapFromJson(dynamic json) {
    final map = <String, LabelsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LabelsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LabelsResponse-objects as value to a dart map
  static Map<String, List<LabelsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LabelsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LabelsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

