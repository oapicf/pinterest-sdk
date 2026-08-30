//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trends_age_bucket.g.dart';

class TrendsAgeBucket extends EnumClass {

  @BuiltValueEnumConst(wireName: r'18-24')
  static const TrendsAgeBucket n1824 = _$n1824;
  @BuiltValueEnumConst(wireName: r'25-34')
  static const TrendsAgeBucket n2534 = _$n2534;
  @BuiltValueEnumConst(wireName: r'35-44')
  static const TrendsAgeBucket n3544 = _$n3544;
  @BuiltValueEnumConst(wireName: r'45-49')
  static const TrendsAgeBucket n4549 = _$n4549;
  @BuiltValueEnumConst(wireName: r'50-54')
  static const TrendsAgeBucket n5054 = _$n5054;
  @BuiltValueEnumConst(wireName: r'55-64')
  static const TrendsAgeBucket n5564 = _$n5564;
  @BuiltValueEnumConst(wireName: r'65+')
  static const TrendsAgeBucket n65plus = _$n65plus;

  static Serializer<TrendsAgeBucket> get serializer => _$trendsAgeBucketSerializer;

  const TrendsAgeBucket._(String name): super(name);

  static BuiltSet<TrendsAgeBucket> get values => _$values;
  static TrendsAgeBucket valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TrendsAgeBucketMixin = Object with _$TrendsAgeBucketMixin;

