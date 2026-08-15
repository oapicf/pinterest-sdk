//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'interests_enum.g.dart';

class InterestsEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ALL')
  static const InterestsEnum ALL = _$ALL;
  @BuiltValueEnumConst(wireName: r'ANIMALS')
  static const InterestsEnum ANIMALS = _$ANIMALS;
  @BuiltValueEnumConst(wireName: r'ARCHITECTURE')
  static const InterestsEnum ARCHITECTURE = _$ARCHITECTURE;
  @BuiltValueEnumConst(wireName: r'ART')
  static const InterestsEnum ART = _$ART;
  @BuiltValueEnumConst(wireName: r'BEAUTY')
  static const InterestsEnum BEAUTY = _$BEAUTY;
  @BuiltValueEnumConst(wireName: r'DIY_AND_CRAFTS')
  static const InterestsEnum DIY_AND_CRAFTS = _$DIY_AND_CRAFTS;
  @BuiltValueEnumConst(wireName: r'EDUCATION')
  static const InterestsEnum EDUCATION = _$EDUCATION;
  @BuiltValueEnumConst(wireName: r'EVENT_PLANNING')
  static const InterestsEnum EVENT_PLANNING = _$EVENT_PLANNING;
  @BuiltValueEnumConst(wireName: r'FASHION')
  static const InterestsEnum FASHION = _$FASHION;
  @BuiltValueEnumConst(wireName: r'FOOD_AND_DRINKS')
  static const InterestsEnum FOOD_AND_DRINKS = _$FOOD_AND_DRINKS;
  @BuiltValueEnumConst(wireName: r'GARDENING')
  static const InterestsEnum GARDENING = _$GARDENING;
  @BuiltValueEnumConst(wireName: r'HEALTH')
  static const InterestsEnum HEALTH = _$HEALTH;
  @BuiltValueEnumConst(wireName: r'HOME_DECOR')
  static const InterestsEnum HOME_DECOR = _$HOME_DECOR;
  @BuiltValueEnumConst(wireName: r'PARENTING')
  static const InterestsEnum PARENTING = _$PARENTING;
  @BuiltValueEnumConst(wireName: r'TRAVEL')
  static const InterestsEnum TRAVEL = _$TRAVEL;
  @BuiltValueEnumConst(wireName: r'WEDDING')
  static const InterestsEnum WEDDING = _$WEDDING;

  static Serializer<InterestsEnum> get serializer => _$interestsEnumSerializer;

  const InterestsEnum._(String name): super(name);

  static BuiltSet<InterestsEnum> get values => _$values;
  static InterestsEnum valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class InterestsEnumMixin = Object with _$InterestsEnumMixin;

