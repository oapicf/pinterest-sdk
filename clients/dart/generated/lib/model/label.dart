//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Label {
  /// Returns a new [Label] instance.
  Label({
    this.id,
    this.labelType,
    this.parentId,
    this.parentType,
    this.status,
    this.value,
  });

  /// Label ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  LabelType? labelType;

  /// Label parent entity ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? parentId;

  /// Label parent entity type.
  LabelParentTypeEnum? parentType;

  LabelStatus? status;

  /// Label name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Label &&
    other.id == id &&
    other.labelType == labelType &&
    other.parentId == parentId &&
    other.parentType == parentType &&
    other.status == status &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (labelType == null ? 0 : labelType!.hashCode) +
    (parentId == null ? 0 : parentId!.hashCode) +
    (parentType == null ? 0 : parentType!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (value == null ? 0 : value!.hashCode);

  @override
  String toString() => 'Label[id=$id, labelType=$labelType, parentId=$parentId, parentType=$parentType, status=$status, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.labelType != null) {
      json[r'label_type'] = this.labelType;
    } else {
      json[r'label_type'] = null;
    }
    if (this.parentId != null) {
      json[r'parent_id'] = this.parentId;
    } else {
      json[r'parent_id'] = null;
    }
    if (this.parentType != null) {
      json[r'parent_type'] = this.parentType;
    } else {
      json[r'parent_type'] = null;
    }
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

  /// Returns a new [Label] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Label? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Label[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Label[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Label(
        id: mapValueOfType<String>(json, r'id'),
        labelType: LabelType.fromJson(json[r'label_type']),
        parentId: mapValueOfType<String>(json, r'parent_id'),
        parentType: LabelParentTypeEnum.fromJson(json[r'parent_type']),
        status: LabelStatus.fromJson(json[r'status']),
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<Label> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Label>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Label.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Label> mapFromJson(dynamic json) {
    final map = <String, Label>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Label.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Label-objects as value to a dart map
  static Map<String, List<Label>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Label>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Label.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Label parent entity type.
class LabelParentTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const LabelParentTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CAMPAIGN = LabelParentTypeEnum._(r'CAMPAIGN');

  /// List of all possible values in this [enum][LabelParentTypeEnum].
  static const values = <LabelParentTypeEnum>[
    CAMPAIGN,
  ];

  static LabelParentTypeEnum? fromJson(dynamic value) => LabelParentTypeEnumTypeTransformer().decode(value);

  static List<LabelParentTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelParentTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelParentTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LabelParentTypeEnum] to String,
/// and [decode] dynamic data back to [LabelParentTypeEnum].
class LabelParentTypeEnumTypeTransformer {
  factory LabelParentTypeEnumTypeTransformer() => _instance ??= const LabelParentTypeEnumTypeTransformer._();

  const LabelParentTypeEnumTypeTransformer._();

  String encode(LabelParentTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a LabelParentTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LabelParentTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CAMPAIGN': return LabelParentTypeEnum.CAMPAIGN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LabelParentTypeEnumTypeTransformer] instance.
  static LabelParentTypeEnumTypeTransformer? _instance;
}


