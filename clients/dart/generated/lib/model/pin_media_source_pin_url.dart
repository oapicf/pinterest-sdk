//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaSourcePinURL {
  /// Returns a new [PinMediaSourcePinURL] instance.
  PinMediaSourcePinURL({
    this.isAffiliateLink = false,
    required this.sourceType,
  });

  /// This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  bool isAffiliateLink;

  PinMediaSourcePinURLSourceTypeEnum sourceType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaSourcePinURL &&
    other.isAffiliateLink == isAffiliateLink &&
    other.sourceType == sourceType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isAffiliateLink.hashCode) +
    (sourceType.hashCode);

  @override
  String toString() => 'PinMediaSourcePinURL[isAffiliateLink=$isAffiliateLink, sourceType=$sourceType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'is_affiliate_link'] = this.isAffiliateLink;
      json[r'source_type'] = this.sourceType;
    return json;
  }

  /// Returns a new [PinMediaSourcePinURL] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaSourcePinURL? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinMediaSourcePinURL[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinMediaSourcePinURL[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinMediaSourcePinURL(
        isAffiliateLink: mapValueOfType<bool>(json, r'is_affiliate_link') ?? false,
        sourceType: PinMediaSourcePinURLSourceTypeEnum.fromJson(json[r'source_type'])!,
      );
    }
    return null;
  }

  static List<PinMediaSourcePinURL> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourcePinURL>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourcePinURL.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaSourcePinURL> mapFromJson(dynamic json) {
    final map = <String, PinMediaSourcePinURL>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaSourcePinURL.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaSourcePinURL-objects as value to a dart map
  static Map<String, List<PinMediaSourcePinURL>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaSourcePinURL>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaSourcePinURL.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'source_type',
  };
}


class PinMediaSourcePinURLSourceTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const PinMediaSourcePinURLSourceTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const pinUrl = PinMediaSourcePinURLSourceTypeEnum._(r'pin_url');

  /// List of all possible values in this [enum][PinMediaSourcePinURLSourceTypeEnum].
  static const values = <PinMediaSourcePinURLSourceTypeEnum>[
    pinUrl,
  ];

  static PinMediaSourcePinURLSourceTypeEnum? fromJson(dynamic value) => PinMediaSourcePinURLSourceTypeEnumTypeTransformer().decode(value);

  static List<PinMediaSourcePinURLSourceTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourcePinURLSourceTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourcePinURLSourceTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaSourcePinURLSourceTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaSourcePinURLSourceTypeEnum].
class PinMediaSourcePinURLSourceTypeEnumTypeTransformer {
  factory PinMediaSourcePinURLSourceTypeEnumTypeTransformer() => _instance ??= const PinMediaSourcePinURLSourceTypeEnumTypeTransformer._();

  const PinMediaSourcePinURLSourceTypeEnumTypeTransformer._();

  String encode(PinMediaSourcePinURLSourceTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PinMediaSourcePinURLSourceTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaSourcePinURLSourceTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'pin_url': return PinMediaSourcePinURLSourceTypeEnum.pinUrl;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PinMediaSourcePinURLSourceTypeEnumTypeTransformer] instance.
  static PinMediaSourcePinURLSourceTypeEnumTypeTransformer? _instance;
}


