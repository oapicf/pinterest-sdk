//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pinner_list_type.g.dart';

class PinnerListType extends EnumClass {

  /// Audience type
  @BuiltValueEnumConst(wireName: r'CUSTOMER_LIST')
  static const PinnerListType CUSTOMER_LIST = _$CUSTOMER_LIST;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'VISITOR')
  static const PinnerListType VISITOR = _$VISITOR;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'ENGAGEMENT')
  static const PinnerListType ENGAGEMENT = _$ENGAGEMENT;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'LOOKALIKE')
  static const PinnerListType LOOKALIKE = _$LOOKALIKE;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'ACTALIKE')
  static const PinnerListType ACTALIKE = _$ACTALIKE;
  /// Audience type
  @BuiltValueEnumConst(wireName: r'PERSONA')
  static const PinnerListType PERSONA = _$PERSONA;

  static Serializer<PinnerListType> get serializer => _$pinnerListTypeSerializer;

  const PinnerListType._(String name): super(name);

  static BuiltSet<PinnerListType> get values => _$values;
  static PinnerListType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PinnerListTypeMixin = Object with _$PinnerListTypeMixin;

