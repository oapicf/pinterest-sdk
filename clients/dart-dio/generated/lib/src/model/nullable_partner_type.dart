//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nullable_partner_type.g.dart';

class NullablePartnerType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'INTERNAL')
  static const NullablePartnerType INTERNAL = _$INTERNAL;
  @BuiltValueEnumConst(wireName: r'EXTERNAL')
  static const NullablePartnerType EXTERNAL = _$EXTERNAL;

  static Serializer<NullablePartnerType> get serializer => _$nullablePartnerTypeSerializer;

  const NullablePartnerType._(String name): super(name);

  static BuiltSet<NullablePartnerType> get values => _$values;
  static NullablePartnerType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NullablePartnerTypeMixin = Object with _$NullablePartnerTypeMixin;

