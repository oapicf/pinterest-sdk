//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingTemplateUpdateRequest {
  /// Returns a new [TargetingTemplateUpdateRequest] instance.
  TargetingTemplateUpdateRequest({
    required this.id,
    required this.operationType,
    this.targetingAttributes,
  });

  /// Targeting template ID
  String id;

  TargetingTemplateUpdateRequestOperationTypeEnum operationType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpec? targetingAttributes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingTemplateUpdateRequest &&
    other.id == id &&
    other.operationType == operationType &&
    other.targetingAttributes == targetingAttributes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (operationType.hashCode) +
    (targetingAttributes == null ? 0 : targetingAttributes!.hashCode);

  @override
  String toString() => 'TargetingTemplateUpdateRequest[id=$id, operationType=$operationType, targetingAttributes=$targetingAttributes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'operation_type'] = this.operationType;
    if (this.targetingAttributes != null) {
      json[r'targeting_attributes'] = this.targetingAttributes;
    } else {
      json[r'targeting_attributes'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingTemplateUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingTemplateUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingTemplateUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingTemplateUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingTemplateUpdateRequest(
        id: mapValueOfType<String>(json, r'id')!,
        operationType: TargetingTemplateUpdateRequestOperationTypeEnum.fromJson(json[r'operation_type'])!,
        targetingAttributes: TargetingSpec.fromJson(json[r'targeting_attributes']),
      );
    }
    return null;
  }

  static List<TargetingTemplateUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplateUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplateUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingTemplateUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, TargetingTemplateUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingTemplateUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingTemplateUpdateRequest-objects as value to a dart map
  static Map<String, List<TargetingTemplateUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingTemplateUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingTemplateUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'operation_type',
  };
}


class TargetingTemplateUpdateRequestOperationTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingTemplateUpdateRequestOperationTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const REMOVE = TargetingTemplateUpdateRequestOperationTypeEnum._(r'REMOVE');
  static const UPDATE = TargetingTemplateUpdateRequestOperationTypeEnum._(r'UPDATE');

  /// List of all possible values in this [enum][TargetingTemplateUpdateRequestOperationTypeEnum].
  static const values = <TargetingTemplateUpdateRequestOperationTypeEnum>[
    REMOVE,
    UPDATE,
  ];

  static TargetingTemplateUpdateRequestOperationTypeEnum? fromJson(dynamic value) => TargetingTemplateUpdateRequestOperationTypeEnumTypeTransformer().decode(value);

  static List<TargetingTemplateUpdateRequestOperationTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplateUpdateRequestOperationTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplateUpdateRequestOperationTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingTemplateUpdateRequestOperationTypeEnum] to String,
/// and [decode] dynamic data back to [TargetingTemplateUpdateRequestOperationTypeEnum].
class TargetingTemplateUpdateRequestOperationTypeEnumTypeTransformer {
  factory TargetingTemplateUpdateRequestOperationTypeEnumTypeTransformer() => _instance ??= const TargetingTemplateUpdateRequestOperationTypeEnumTypeTransformer._();

  const TargetingTemplateUpdateRequestOperationTypeEnumTypeTransformer._();

  String encode(TargetingTemplateUpdateRequestOperationTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingTemplateUpdateRequestOperationTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingTemplateUpdateRequestOperationTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'REMOVE': return TargetingTemplateUpdateRequestOperationTypeEnum.REMOVE;
        case r'UPDATE': return TargetingTemplateUpdateRequestOperationTypeEnum.UPDATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingTemplateUpdateRequestOperationTypeEnumTypeTransformer] instance.
  static TargetingTemplateUpdateRequestOperationTypeEnumTypeTransformer? _instance;
}


