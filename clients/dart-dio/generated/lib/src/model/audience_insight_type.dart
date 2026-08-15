//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_insight_type.g.dart';

class AudienceInsightType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'YOUR_TOTAL_AUDIENCE')
  static const AudienceInsightType YOUR_TOTAL_AUDIENCE = _$YOUR_TOTAL_AUDIENCE;
  @BuiltValueEnumConst(wireName: r'YOUR_ENGAGED_AUDIENCE')
  static const AudienceInsightType YOUR_ENGAGED_AUDIENCE = _$YOUR_ENGAGED_AUDIENCE;
  @BuiltValueEnumConst(wireName: r'PINTEREST_TOTAL_AUDIENCE')
  static const AudienceInsightType PINTEREST_TOTAL_AUDIENCE = _$PINTEREST_TOTAL_AUDIENCE;

  static Serializer<AudienceInsightType> get serializer => _$audienceInsightTypeSerializer;

  const AudienceInsightType._(String name): super(name);

  static BuiltSet<AudienceInsightType> get values => _$values;
  static AudienceInsightType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudienceInsightTypeMixin = Object with _$AudienceInsightTypeMixin;

