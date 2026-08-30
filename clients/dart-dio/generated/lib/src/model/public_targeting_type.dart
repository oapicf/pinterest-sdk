//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'public_targeting_type.g.dart';

class PublicTargetingType extends EnumClass {

  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const PublicTargetingType APPTYPE = _$APPTYPE;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const PublicTargetingType GENDER = _$GENDER;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'LOCALE')
  static const PublicTargetingType LOCALE = _$LOCALE;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const PublicTargetingType AGE_BUCKET = _$AGE_BUCKET;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const PublicTargetingType LOCATION = _$LOCATION;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'GEO')
  static const PublicTargetingType GEO = _$GEO;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'INTEREST')
  static const PublicTargetingType INTEREST = _$INTEREST;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const PublicTargetingType KEYWORD = _$KEYWORD;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const PublicTargetingType AUDIENCE_INCLUDE = _$AUDIENCE_INCLUDE;
  /// Public ad targeting type with external names
  @BuiltValueEnumConst(wireName: r'AUDIENCE_EXCLUDE')
  static const PublicTargetingType AUDIENCE_EXCLUDE = _$AUDIENCE_EXCLUDE;

  static Serializer<PublicTargetingType> get serializer => _$publicTargetingTypeSerializer;

  const PublicTargetingType._(String name): super(name);

  static BuiltSet<PublicTargetingType> get values => _$values;
  static PublicTargetingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PublicTargetingTypeMixin = Object with _$PublicTargetingTypeMixin;

