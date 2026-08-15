//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_age_bucket.g.dart';

class TargetingSpecAgeBucket extends EnumClass {

  @BuiltValueEnumConst(wireName: r'18-24')
  static const TargetingSpecAgeBucket n1824 = _$n1824;
  @BuiltValueEnumConst(wireName: r'19+')
  static const TargetingSpecAgeBucket n19plus = _$n19plus;
  @BuiltValueEnumConst(wireName: r'20+')
  static const TargetingSpecAgeBucket n20plus = _$n20plus;
  @BuiltValueEnumConst(wireName: r'21+')
  static const TargetingSpecAgeBucket n21plus = _$n21plus;
  @BuiltValueEnumConst(wireName: r'25-34')
  static const TargetingSpecAgeBucket n2534 = _$n2534;
  @BuiltValueEnumConst(wireName: r'35-44')
  static const TargetingSpecAgeBucket n3544 = _$n3544;
  @BuiltValueEnumConst(wireName: r'45-49')
  static const TargetingSpecAgeBucket n4549 = _$n4549;
  @BuiltValueEnumConst(wireName: r'50-54')
  static const TargetingSpecAgeBucket n5054 = _$n5054;
  @BuiltValueEnumConst(wireName: r'55-64')
  static const TargetingSpecAgeBucket n5564 = _$n5564;
  @BuiltValueEnumConst(wireName: r'65+')
  static const TargetingSpecAgeBucket n65plus = _$n65plus;

  static Serializer<TargetingSpecAgeBucket> get serializer => _$targetingSpecAgeBucketSerializer;

  const TargetingSpecAgeBucket._(String name): super(name);

  static BuiltSet<TargetingSpecAgeBucket> get values => _$values;
  static TargetingSpecAgeBucket valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TargetingSpecAgeBucketMixin = Object with _$TargetingSpecAgeBucketMixin;

