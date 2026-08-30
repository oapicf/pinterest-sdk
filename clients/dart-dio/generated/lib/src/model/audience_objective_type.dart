//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_objective_type.g.dart';

class AudienceObjectiveType extends EnumClass {

  /// Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
  @BuiltValueEnumConst(wireName: r'AWARENESS')
  static const AudienceObjectiveType AWARENESS = _$AWARENESS;
  /// Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
  @BuiltValueEnumConst(wireName: r'CONSIDERATION')
  static const AudienceObjectiveType CONSIDERATION = _$CONSIDERATION;
  /// Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
  @BuiltValueEnumConst(wireName: r'WEB_CONVERSION')
  static const AudienceObjectiveType WEB_CONVERSION = _$WEB_CONVERSION;
  /// Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
  @BuiltValueEnumConst(wireName: r'CATALOG_SALES')
  static const AudienceObjectiveType CATALOG_SALES = _$CATALOG_SALES;
  /// Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
  @BuiltValueEnumConst(wireName: r'VIDEO_COMPLETION')
  static const AudienceObjectiveType VIDEO_COMPLETION = _$VIDEO_COMPLETION;
  /// Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
  @BuiltValueEnumConst(wireName: r'SALES')
  static const AudienceObjectiveType SALES = _$SALES;

  static Serializer<AudienceObjectiveType> get serializer => _$audienceObjectiveTypeSerializer;

  const AudienceObjectiveType._(String name): super(name);

  static BuiltSet<AudienceObjectiveType> get values => _$values;
  static AudienceObjectiveType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudienceObjectiveTypeMixin = Object with _$AudienceObjectiveTypeMixin;

