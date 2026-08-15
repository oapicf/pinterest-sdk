//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LabelCreateRequest {
  /// Returns a new [LabelCreateRequest] instance.
  LabelCreateRequest({
    this.labels = const [],
    required this.parentId,
  });

  /// Labels that you are applying to the campaign.
  List<LabelCreateRequestLabelsInner> labels;

  /// Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  String parentId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LabelCreateRequest &&
    _deepEquality.equals(other.labels, labels) &&
    other.parentId == parentId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (labels.hashCode) +
    (parentId.hashCode);

  @override
  String toString() => 'LabelCreateRequest[labels=$labels, parentId=$parentId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'labels'] = this.labels;
      json[r'parent_id'] = this.parentId;
    return json;
  }

  /// Returns a new [LabelCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LabelCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LabelCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LabelCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LabelCreateRequest(
        labels: LabelCreateRequestLabelsInner.listFromJson(json[r'labels']),
        parentId: mapValueOfType<String>(json, r'parent_id')!,
      );
    }
    return null;
  }

  static List<LabelCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LabelCreateRequest> mapFromJson(dynamic json) {
    final map = <String, LabelCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LabelCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LabelCreateRequest-objects as value to a dart map
  static Map<String, List<LabelCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LabelCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LabelCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'labels',
    'parent_id',
  };
}

