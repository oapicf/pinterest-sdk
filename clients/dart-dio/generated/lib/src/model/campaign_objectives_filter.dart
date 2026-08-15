//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/objective_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_objectives_filter.g.dart';

/// CampaignObjectivesFilter
///
/// Properties:
/// * [campaignObjectiveTypes] - List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
@BuiltValue()
abstract class CampaignObjectivesFilter implements Built<CampaignObjectivesFilter, CampaignObjectivesFilterBuilder> {
  /// List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  @BuiltValueField(wireName: r'campaign_objective_types')
  BuiltList<ObjectiveType>? get campaignObjectiveTypes;

  CampaignObjectivesFilter._();

  factory CampaignObjectivesFilter([void updates(CampaignObjectivesFilterBuilder b)]) = _$CampaignObjectivesFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignObjectivesFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignObjectivesFilter> get serializer => _$CampaignObjectivesFilterSerializer();
}

class _$CampaignObjectivesFilterSerializer implements PrimitiveSerializer<CampaignObjectivesFilter> {
  @override
  final Iterable<Type> types = const [CampaignObjectivesFilter, _$CampaignObjectivesFilter];

  @override
  final String wireName = r'CampaignObjectivesFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignObjectivesFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.campaignObjectiveTypes != null) {
      yield r'campaign_objective_types';
      yield serializers.serialize(
        object.campaignObjectiveTypes,
        specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignObjectivesFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignObjectivesFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'campaign_objective_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
          ) as BuiltList<ObjectiveType>;
          result.campaignObjectiveTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignObjectivesFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignObjectivesFilterBuilder();
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

