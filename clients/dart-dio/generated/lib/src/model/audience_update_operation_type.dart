//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_update_operation_type.g.dart';

class AudienceUpdateOperationType extends EnumClass {

  /// Audience operation type (update or remove).
  @BuiltValueEnumConst(wireName: r'UPDATE')
  static const AudienceUpdateOperationType UPDATE = _$UPDATE;
  /// Audience operation type (update or remove).
  @BuiltValueEnumConst(wireName: r'REMOVE')
  static const AudienceUpdateOperationType REMOVE = _$REMOVE;

  static Serializer<AudienceUpdateOperationType> get serializer => _$audienceUpdateOperationTypeSerializer;

  const AudienceUpdateOperationType._(String name): super(name);

  static BuiltSet<AudienceUpdateOperationType> get values => _$values;
  static AudienceUpdateOperationType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudienceUpdateOperationTypeMixin = Object with _$AudienceUpdateOperationTypeMixin;

