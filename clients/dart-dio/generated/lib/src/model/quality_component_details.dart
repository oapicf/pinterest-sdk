//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/quality_component_issue.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'quality_component_details.g.dart';

/// Metrics for a specific event type within a quality component.
///
/// Properties:
/// * [coverage] - Coverage percentage for this event type.
/// * [issues] - List of issues detected for this event type, if any.
/// * [overlap] - Overlap percentage for this event type. Only populated for external_event_id
@BuiltValue()
abstract class QualityComponentDetails implements Built<QualityComponentDetails, QualityComponentDetailsBuilder> {
  /// Coverage percentage for this event type.
  @BuiltValueField(wireName: r'coverage')
  num get coverage;

  /// List of issues detected for this event type, if any.
  @BuiltValueField(wireName: r'issues')
  BuiltList<QualityComponentIssue>? get issues;

  /// Overlap percentage for this event type. Only populated for external_event_id
  @BuiltValueField(wireName: r'overlap')
  num? get overlap;

  QualityComponentDetails._();

  factory QualityComponentDetails([void updates(QualityComponentDetailsBuilder b)]) = _$QualityComponentDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(QualityComponentDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<QualityComponentDetails> get serializer => _$QualityComponentDetailsSerializer();
}

class _$QualityComponentDetailsSerializer implements PrimitiveSerializer<QualityComponentDetails> {
  @override
  final Iterable<Type> types = const [QualityComponentDetails, _$QualityComponentDetails];

  @override
  final String wireName = r'QualityComponentDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    QualityComponentDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'coverage';
    yield serializers.serialize(
      object.coverage,
      specifiedType: const FullType(num),
    );
    if (object.issues != null) {
      yield r'issues';
      yield serializers.serialize(
        object.issues,
        specifiedType: const FullType(BuiltList, [FullType(QualityComponentIssue)]),
      );
    }
    if (object.overlap != null) {
      yield r'overlap';
      yield serializers.serialize(
        object.overlap,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    QualityComponentDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required QualityComponentDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'coverage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.coverage = valueDes;
          break;
        case r'issues':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(QualityComponentIssue)]),
          ) as BuiltList<QualityComponentIssue>?;
          if (valueDes == null) continue;
          result.issues.replace(valueDes);
          break;
        case r'overlap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.overlap = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  QualityComponentDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = QualityComponentDetailsBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

