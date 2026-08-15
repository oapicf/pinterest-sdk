//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_type.g.dart';

class AudienceType extends EnumClass {

  /// Audience type
  @BuiltValueEnumConst(wireName: r'CUSTOMER_LIST')
  static const AudienceType CUSTOMER_LIST = _$CUSTOMER_LIST;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'VISITOR')
  static const AudienceType VISITOR = _$VISITOR;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'ENGAGEMENT')
  static const AudienceType ENGAGEMENT = _$ENGAGEMENT;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'ACTALIKE')
  static const AudienceType ACTALIKE = _$ACTALIKE;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'PERSONA')
  static const AudienceType PERSONA = _$PERSONA;

  static Serializer<AudienceType> get serializer => _$audienceTypeSerializer;

  const AudienceType._(String name): super(name);

  static BuiltSet<AudienceType> get values => _$values;
  static AudienceType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudienceTypeMixin = Object with _$AudienceTypeMixin;

