//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'gender_bucket.g.dart';

class GenderBucket extends EnumClass {

  @BuiltValueEnumConst(wireName: r'MALE')
  static const GenderBucket MALE = _$MALE;
  @BuiltValueEnumConst(wireName: r'FEMALE')
  static const GenderBucket FEMALE = _$FEMALE;
  @BuiltValueEnumConst(wireName: r'UNSPECIFIED')
  static const GenderBucket UNSPECIFIED = _$UNSPECIFIED;

  static Serializer<GenderBucket> get serializer => _$genderBucketSerializer;

  const GenderBucket._(String name): super(name);

  static BuiltSet<GenderBucket> get values => _$values;
  static GenderBucket valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class GenderBucketMixin = Object with _$GenderBucketMixin;

