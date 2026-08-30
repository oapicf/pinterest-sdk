//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Disclosure label for AI-generated or AI-modified content in a catalog item asset.
enum CatalogsAiContentDisclosureLabel {
  aiModified._(r'ai_modified'),
  syntheticPerformer._(r'synthetic_performer'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsAiContentDisclosureLabel._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsAiContentDisclosureLabel] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsAiContentDisclosureLabel? fromJson(dynamic value) => CatalogsAiContentDisclosureLabelTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsAiContentDisclosureLabel]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsAiContentDisclosureLabel> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsAiContentDisclosureLabel>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsAiContentDisclosureLabel.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsAiContentDisclosureLabel] to String,
/// and [decode] dynamic data back to [CatalogsAiContentDisclosureLabel].
class CatalogsAiContentDisclosureLabelTypeTransformer {
  factory CatalogsAiContentDisclosureLabelTypeTransformer() => _instance ??= const CatalogsAiContentDisclosureLabelTypeTransformer._();

  const CatalogsAiContentDisclosureLabelTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CatalogsAiContentDisclosureLabel data) => data._value;

  /// Returns the instance of [CatalogsAiContentDisclosureLabel] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsAiContentDisclosureLabel? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsAiContentDisclosureLabel) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ai_modified': return CatalogsAiContentDisclosureLabel.aiModified;
        case r'synthetic_performer': return CatalogsAiContentDisclosureLabel.syntheticPerformer;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsAiContentDisclosureLabelTypeTransformer? _instance;
}

