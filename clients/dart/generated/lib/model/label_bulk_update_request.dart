//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LabelBulkUpdateRequest {
  /// Returns a new [LabelBulkUpdateRequest] instance.
  LabelBulkUpdateRequest({
    required this.id,
    this.status,
    this.value,
  });

  /// Label ID.
  String id;

  /// Set status to `ARCHIVED` to remove the label from the parent entity.
  LabelBulkUpdateRequestStatusEnum? status;

  /// </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LabelBulkUpdateRequest &&
    other.id == id &&
    other.status == status &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (value == null ? 0 : value!.hashCode);

  @override
  String toString() => 'LabelBulkUpdateRequest[id=$id, status=$status, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    return json;
  }

  /// Returns a new [LabelBulkUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LabelBulkUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LabelBulkUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LabelBulkUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LabelBulkUpdateRequest(
        id: mapValueOfType<String>(json, r'id')!,
        status: LabelBulkUpdateRequestStatusEnum.fromJson(json[r'status']),
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<LabelBulkUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelBulkUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelBulkUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LabelBulkUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, LabelBulkUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LabelBulkUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LabelBulkUpdateRequest-objects as value to a dart map
  static Map<String, List<LabelBulkUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LabelBulkUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LabelBulkUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

/// Set status to `ARCHIVED` to remove the label from the parent entity.
class LabelBulkUpdateRequestStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const LabelBulkUpdateRequestStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ARCHIVED = LabelBulkUpdateRequestStatusEnum._(r'ARCHIVED');

  /// List of all possible values in this [enum][LabelBulkUpdateRequestStatusEnum].
  static const values = <LabelBulkUpdateRequestStatusEnum>[
    ARCHIVED,
  ];

  static LabelBulkUpdateRequestStatusEnum? fromJson(dynamic value) => LabelBulkUpdateRequestStatusEnumTypeTransformer().decode(value);

  static List<LabelBulkUpdateRequestStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelBulkUpdateRequestStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelBulkUpdateRequestStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LabelBulkUpdateRequestStatusEnum] to String,
/// and [decode] dynamic data back to [LabelBulkUpdateRequestStatusEnum].
class LabelBulkUpdateRequestStatusEnumTypeTransformer {
  factory LabelBulkUpdateRequestStatusEnumTypeTransformer() => _instance ??= const LabelBulkUpdateRequestStatusEnumTypeTransformer._();

  const LabelBulkUpdateRequestStatusEnumTypeTransformer._();

  String encode(LabelBulkUpdateRequestStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a LabelBulkUpdateRequestStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LabelBulkUpdateRequestStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ARCHIVED': return LabelBulkUpdateRequestStatusEnum.ARCHIVED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LabelBulkUpdateRequestStatusEnumTypeTransformer] instance.
  static LabelBulkUpdateRequestStatusEnumTypeTransformer? _instance;
}


