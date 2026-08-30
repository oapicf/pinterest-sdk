//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_status.g.dart';

class AudienceStatus extends EnumClass {

  /// Audience processing status
  @BuiltValueEnumConst(wireName: r'INITIALIZING')
  static const AudienceStatus INITIALIZING = _$INITIALIZING;
  /// Audience processing status
  @BuiltValueEnumConst(wireName: r'READY')
  static const AudienceStatus READY = _$READY;
  /// Audience processing status
  @BuiltValueEnumConst(wireName: r'TOO_SMALL')
  static const AudienceStatus TOO_SMALL = _$TOO_SMALL;
  /// Audience processing status
  @BuiltValueEnumConst(wireName: r'ELIGIBLE')
  static const AudienceStatus ELIGIBLE = _$ELIGIBLE;
  /// Audience processing status
  @BuiltValueEnumConst(wireName: r'PERSONAS_INELIGIBLE_SIZE')
  static const AudienceStatus PERSONAS_INELIGIBLE_SIZE = _$PERSONAS_INELIGIBLE_SIZE;
  /// Audience processing status
  @BuiltValueEnumConst(wireName: r'PERSONAS_INITIALIZING')
  static const AudienceStatus PERSONAS_INITIALIZING = _$PERSONAS_INITIALIZING;

  static Serializer<AudienceStatus> get serializer => _$audienceStatusSerializer;

  const AudienceStatus._(String name): super(name);

  static BuiltSet<AudienceStatus> get values => _$values;
  static AudienceStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudienceStatusMixin = Object with _$AudienceStatusMixin;

